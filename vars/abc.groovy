
def gitdownload(repo)
{
git "https://github.com/IntelliqDevops/${repo}.git"
}
def gitbuildArtifact()
{
  sh 'mvn package'
}
def DeployementTomcat(jobname,ipaddress,contextpath)
{

sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war azureuser@${ipaddress}:/var/lib/tomcat10/webapps/${contextpath}.war"
  
}
