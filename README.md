<img width="780" alt="image" src="https://github.com/swapanGit/student-address-microservice/assets/47151255/12aea558-8a92-4aa8-bcbb-19068a5eb0e3">

# student-address-microservice
# address-service
http://localhost:8091/swagger-ui/index.html </br>
http://localhost:8091/h2-console </br>
# student-service
http://localhost:8092/swagger-ui/index.html </br>
http://localhost:8092/h2-console </br>
# service-registry
http://localhost:8761/ </br>
# cloud-gateway
http://localhost:8889/hystrix </br>
# hystrix-dashboard
http://localhost:8989/actuator/hystrix.stream </br>
http://localhost:8989/addresses/saveAddress </br>
http://localhost:8989/students/saveStudent </br>
http://localhost:8989/addresses/getAddressById/1 </br>
http://localhost:8989/students/getStudentById/1 </br>




``` Working with Openshift ```
# prerequisite:
1. https://www.virtualbox.org/wiki/Downloads
2. https://github.com/minishift/minishift/releases

![image](https://github.com/swapanGit/student-address-microservice/assets/47151255/00ee43f8-dc8c-4466-9614-8eabc7a780d4)

![image](https://github.com/swapanGit/student-address-microservice/assets/47151255/671d039f-0178-4132-a0c8-3f825a7a2345)

![image](https://github.com/swapanGit/student-address-microservice/assets/47151255/949ab586-640d-4e53-9878-aaf15d33d86f)

# issues: ([Starting Minishift VM ........... FAIL E0519...] Error starting the VM: Error creating the VM. Error creating machine: Error in driver during machine creation)
![image](https://github.com/swapanGit/student-address-microservice/assets/47151255/32a9f2fa-2db0-47d3-a158-277edc53b41f)
# just disable the issued network [windows path:: Control Panel\Network and Internet\Network Connections]
![image](https://github.com/swapanGit/student-address-microservice/assets/47151255/8c99a1c8-623a-4747-9980-addf08d80c34)

# login to cli:
![image](https://github.com/swapanGit/student-address-microservice/assets/47151255/3a2f2bdf-c453-4944-857f-532fc7e6411a)

![image](https://github.com/swapanGit/student-address-microservice/assets/47151255/851264d7-6f8c-4d1e-8216-fd7e6791a9eb)

