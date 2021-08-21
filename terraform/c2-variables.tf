variable "aws_region"{
    descrption ="any description"
    type=string
    default="us-east-1"
}
variable "instance_type"{
    descrption ="any description"
    type=string
    default="t2.micro"
}
variable "instance_keypair"{
    descrption ="any description"
    type=string
    default="key-name"
}

# AWS EC2 Instance Type - List
variable "instance_type_list" {
  description = "EC2 Instance Type"
  type = list(string)
  default = ["t3.micro", "t3.small", "t3.large"]  
}

# AWS EC2 Instance Type - Map
variable "instance_type_map" {
  description = "EC2 Instance Type"
  type = map(string)
  default = {
    "dev" = "t3.micro"
    "qa" = "t3.small"
    "prod" = "t3.large"
  }
}