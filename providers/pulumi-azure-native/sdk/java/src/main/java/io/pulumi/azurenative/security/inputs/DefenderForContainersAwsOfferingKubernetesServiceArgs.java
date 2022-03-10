// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The kubernetes service connection configuration
 * 
 */
public final class DefenderForContainersAwsOfferingKubernetesServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefenderForContainersAwsOfferingKubernetesServiceArgs Empty = new DefenderForContainersAwsOfferingKubernetesServiceArgs();

    /**
     * The cloud role ARN in AWS for this feature
     * 
     */
    @InputImport(name="cloudRoleArn")
      private final @Nullable Input<String> cloudRoleArn;

    public Input<String> getCloudRoleArn() {
        return this.cloudRoleArn == null ? Input.empty() : this.cloudRoleArn;
    }

    public DefenderForContainersAwsOfferingKubernetesServiceArgs(@Nullable Input<String> cloudRoleArn) {
        this.cloudRoleArn = cloudRoleArn;
    }

    private DefenderForContainersAwsOfferingKubernetesServiceArgs() {
        this.cloudRoleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefenderForContainersAwsOfferingKubernetesServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cloudRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DefenderForContainersAwsOfferingKubernetesServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudRoleArn = defaults.cloudRoleArn;
        }

        public Builder cloudRoleArn(@Nullable Input<String> cloudRoleArn) {
            this.cloudRoleArn = cloudRoleArn;
            return this;
        }

        public Builder cloudRoleArn(@Nullable String cloudRoleArn) {
            this.cloudRoleArn = Input.ofNullable(cloudRoleArn);
            return this;
        }
        public DefenderForContainersAwsOfferingKubernetesServiceArgs build() {
            return new DefenderForContainersAwsOfferingKubernetesServiceArgs(cloudRoleArn);
        }
    }
}
