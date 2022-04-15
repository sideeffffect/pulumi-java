// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.WorkforceCognitoConfigGetArgs;
import io.pulumi.aws.sagemaker.inputs.WorkforceOidcConfigGetArgs;
import io.pulumi.aws.sagemaker.inputs.WorkforceSourceIpConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkforceState extends io.pulumi.resources.ResourceArgs {

    public static final WorkforceState Empty = new WorkforceState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Workforce.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created using and corresponds to a single Amazon Cognito user pool. Conflicts with `oidc_config`. see Cognito Config details below.
     * 
     */
    @Import(name="cognitoConfig")
      private final @Nullable Output<WorkforceCognitoConfigGetArgs> cognitoConfig;

    public Output<WorkforceCognitoConfigGetArgs> cognitoConfig() {
        return this.cognitoConfig == null ? Codegen.empty() : this.cognitoConfig;
    }

    /**
     * Use this parameter to configure a private workforce using your own OIDC Identity Provider. Conflicts with `cognito_config`. see OIDC Config details below.
     * 
     */
    @Import(name="oidcConfig")
      private final @Nullable Output<WorkforceOidcConfigGetArgs> oidcConfig;

    public Output<WorkforceOidcConfigGetArgs> oidcConfig() {
        return this.oidcConfig == null ? Codegen.empty() : this.oidcConfig;
    }

    /**
     * A list of IP address ranges Used to create an allow list of IP addresses for a private workforce. By default, a workforce isn't restricted to specific IP addresses. see Source Ip Config details below.
     * 
     */
    @Import(name="sourceIpConfig")
      private final @Nullable Output<WorkforceSourceIpConfigGetArgs> sourceIpConfig;

    public Output<WorkforceSourceIpConfigGetArgs> sourceIpConfig() {
        return this.sourceIpConfig == null ? Codegen.empty() : this.sourceIpConfig;
    }

    /**
     * The subdomain for your OIDC Identity Provider.
     * 
     */
    @Import(name="subdomain")
      private final @Nullable Output<String> subdomain;

    public Output<String> subdomain() {
        return this.subdomain == null ? Codegen.empty() : this.subdomain;
    }

    /**
     * The name of the Workforce (must be unique).
     * 
     */
    @Import(name="workforceName")
      private final @Nullable Output<String> workforceName;

    public Output<String> workforceName() {
        return this.workforceName == null ? Codegen.empty() : this.workforceName;
    }

    public WorkforceState(
        @Nullable Output<String> arn,
        @Nullable Output<WorkforceCognitoConfigGetArgs> cognitoConfig,
        @Nullable Output<WorkforceOidcConfigGetArgs> oidcConfig,
        @Nullable Output<WorkforceSourceIpConfigGetArgs> sourceIpConfig,
        @Nullable Output<String> subdomain,
        @Nullable Output<String> workforceName) {
        this.arn = arn;
        this.cognitoConfig = cognitoConfig;
        this.oidcConfig = oidcConfig;
        this.sourceIpConfig = sourceIpConfig;
        this.subdomain = subdomain;
        this.workforceName = workforceName;
    }

    private WorkforceState() {
        this.arn = Codegen.empty();
        this.cognitoConfig = Codegen.empty();
        this.oidcConfig = Codegen.empty();
        this.sourceIpConfig = Codegen.empty();
        this.subdomain = Codegen.empty();
        this.workforceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkforceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<WorkforceCognitoConfigGetArgs> cognitoConfig;
        private @Nullable Output<WorkforceOidcConfigGetArgs> oidcConfig;
        private @Nullable Output<WorkforceSourceIpConfigGetArgs> sourceIpConfig;
        private @Nullable Output<String> subdomain;
        private @Nullable Output<String> workforceName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkforceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.cognitoConfig = defaults.cognitoConfig;
    	      this.oidcConfig = defaults.oidcConfig;
    	      this.sourceIpConfig = defaults.sourceIpConfig;
    	      this.subdomain = defaults.subdomain;
    	      this.workforceName = defaults.workforceName;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder cognitoConfig(@Nullable Output<WorkforceCognitoConfigGetArgs> cognitoConfig) {
            this.cognitoConfig = cognitoConfig;
            return this;
        }
        public Builder cognitoConfig(@Nullable WorkforceCognitoConfigGetArgs cognitoConfig) {
            this.cognitoConfig = Codegen.ofNullable(cognitoConfig);
            return this;
        }
        public Builder oidcConfig(@Nullable Output<WorkforceOidcConfigGetArgs> oidcConfig) {
            this.oidcConfig = oidcConfig;
            return this;
        }
        public Builder oidcConfig(@Nullable WorkforceOidcConfigGetArgs oidcConfig) {
            this.oidcConfig = Codegen.ofNullable(oidcConfig);
            return this;
        }
        public Builder sourceIpConfig(@Nullable Output<WorkforceSourceIpConfigGetArgs> sourceIpConfig) {
            this.sourceIpConfig = sourceIpConfig;
            return this;
        }
        public Builder sourceIpConfig(@Nullable WorkforceSourceIpConfigGetArgs sourceIpConfig) {
            this.sourceIpConfig = Codegen.ofNullable(sourceIpConfig);
            return this;
        }
        public Builder subdomain(@Nullable Output<String> subdomain) {
            this.subdomain = subdomain;
            return this;
        }
        public Builder subdomain(@Nullable String subdomain) {
            this.subdomain = Codegen.ofNullable(subdomain);
            return this;
        }
        public Builder workforceName(@Nullable Output<String> workforceName) {
            this.workforceName = workforceName;
            return this;
        }
        public Builder workforceName(@Nullable String workforceName) {
            this.workforceName = Codegen.ofNullable(workforceName);
            return this;
        }        public WorkforceState build() {
            return new WorkforceState(arn, cognitoConfig, oidcConfig, sourceIpConfig, subdomain, workforceName);
        }
    }
}
