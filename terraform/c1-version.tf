terraform{
    required_versions = "~> 0.14"
    required_providers{
        aws={
            source = "hasicorp/aws"
            version = "~> 3.0"
        }
    }
}
provider "aws"{
    #region = "us-east-1"
    region = var.aws_region
    access_key = ""
    secret_key = ""
}