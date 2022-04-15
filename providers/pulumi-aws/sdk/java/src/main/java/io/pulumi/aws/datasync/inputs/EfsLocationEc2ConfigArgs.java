// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class EfsLocationEc2ConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EfsLocationEc2ConfigArgs Empty = new EfsLocationEc2ConfigArgs();

    /**
     * List of Amazon Resource Names (ARNs) of the EC2 Security Groups that are associated with the EFS Mount Target.
     * 
     */
    @Import(name="securityGroupArns", required=true)
      private final Output<List<String>> securityGroupArns;

    public Output<List<String>> securityGroupArns() {
        return this.securityGroupArns;
    }

    /**
     * Amazon Resource Name (ARN) of the EC2 Subnet that is associated with the EFS Mount Target.
     * 
     */
    @Import(name="subnetArn", required=true)
      private final Output<String> subnetArn;

    public Output<String> subnetArn() {
        return this.subnetArn;
    }

    public EfsLocationEc2ConfigArgs(
        Output<List<String>> securityGroupArns,
        Output<String> subnetArn) {
        this.securityGroupArns = Objects.requireNonNull(securityGroupArns, "expected parameter 'securityGroupArns' to be non-null");
        this.subnetArn = Objects.requireNonNull(subnetArn, "expected parameter 'subnetArn' to be non-null");
    }

    private EfsLocationEc2ConfigArgs() {
        this.securityGroupArns = Codegen.empty();
        this.subnetArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EfsLocationEc2ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> securityGroupArns;
        private Output<String> subnetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EfsLocationEc2ConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupArns = defaults.securityGroupArns;
    	      this.subnetArn = defaults.subnetArn;
        }

        public Builder securityGroupArns(Output<List<String>> securityGroupArns) {
            this.securityGroupArns = Objects.requireNonNull(securityGroupArns);
            return this;
        }
        public Builder securityGroupArns(List<String> securityGroupArns) {
            this.securityGroupArns = Output.of(Objects.requireNonNull(securityGroupArns));
            return this;
        }
        public Builder securityGroupArns(String... securityGroupArns) {
            return securityGroupArns(List.of(securityGroupArns));
        }
        public Builder subnetArn(Output<String> subnetArn) {
            this.subnetArn = Objects.requireNonNull(subnetArn);
            return this;
        }
        public Builder subnetArn(String subnetArn) {
            this.subnetArn = Output.of(Objects.requireNonNull(subnetArn));
            return this;
        }        public EfsLocationEc2ConfigArgs build() {
            return new EfsLocationEc2ConfigArgs(securityGroupArns, subnetArn);
        }
    }
}
