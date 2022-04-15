// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AwsClusterControlPlaneAwsServicesAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsClusterControlPlaneAwsServicesAuthenticationArgs Empty = new AwsClusterControlPlaneAwsServicesAuthenticationArgs();

    /**
     * Required. The Amazon Resource Name (ARN) of the role that the Anthos Multi-Cloud API will assume when managing AWS resources on your account.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * Optional. An identifier for the assumed role session. When unspecified, it defaults to `multicloud-service-agent`.
     * 
     */
    @Import(name="roleSessionName")
      private final @Nullable Output<String> roleSessionName;

    public Output<String> roleSessionName() {
        return this.roleSessionName == null ? Codegen.empty() : this.roleSessionName;
    }

    public AwsClusterControlPlaneAwsServicesAuthenticationArgs(
        Output<String> roleArn,
        @Nullable Output<String> roleSessionName) {
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.roleSessionName = roleSessionName;
    }

    private AwsClusterControlPlaneAwsServicesAuthenticationArgs() {
        this.roleArn = Codegen.empty();
        this.roleSessionName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterControlPlaneAwsServicesAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> roleArn;
        private @Nullable Output<String> roleSessionName;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterControlPlaneAwsServicesAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.roleSessionName = defaults.roleSessionName;
        }

        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder roleSessionName(@Nullable Output<String> roleSessionName) {
            this.roleSessionName = roleSessionName;
            return this;
        }
        public Builder roleSessionName(@Nullable String roleSessionName) {
            this.roleSessionName = Codegen.ofNullable(roleSessionName);
            return this;
        }        public AwsClusterControlPlaneAwsServicesAuthenticationArgs build() {
            return new AwsClusterControlPlaneAwsServicesAuthenticationArgs(roleArn, roleSessionName);
        }
    }
}
