echo 'delete start'
kubectl delete -f ./jenkins/deploy.yaml
echo 'deploy start'
kubectl apply -f ./jenkins/deploy.yaml
echo 'deploy successfully'

