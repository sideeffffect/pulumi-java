// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.awsnative.ecs.enums.ServiceAwsVpcConfigurationAssignPublicIp;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceAwsVpcConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final ServiceAwsVpcConfiguration Empty = new ServiceAwsVpcConfiguration();

    @Import(name="assignPublicIp")
      private final @Nullable ServiceAwsVpcConfigurationAssignPublicIp assignPublicIp;

    public Optional<ServiceAwsVpcConfigurationAssignPublicIp> assignPublicIp() {
        return this.assignPublicIp == null ? Optional.empty() : Optional.ofNullable(this.assignPublicIp);
    }

    @Import(name="securityGroups")
      private final @Nullable List<String> securityGroups;

    public List<String> securityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }

    @Import(name="subnets")
      private final @Nullable List<String> subnets;

    public List<String> subnets() {
        return this.subnets == null ? List.of() : this.subnets;
    }

    public ServiceAwsVpcConfiguration(
        @Nullable ServiceAwsVpcConfigurationAssignPublicIp assignPublicIp,
        @Nullable List<String> securityGroups,
        @Nullable List<String> subnets) {
        this.assignPublicIp = assignPublicIp;
        this.securityGroups = securityGroups;
        this.subnets = subnets;
    }

    private ServiceAwsVpcConfiguration() {
        this.assignPublicIp = null;
        this.securityGroups = List.of();
        this.subnets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAwsVpcConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceAwsVpcConfigurationAssignPublicIp assignPublicIp;
        private @Nullable List<String> securityGroups;
        private @Nullable List<String> subnets;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAwsVpcConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignPublicIp = defaults.assignPublicIp;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnets = defaults.subnets;
        }

        public Builder assignPublicIp(@Nullable ServiceAwsVpcConfigurationAssignPublicIp assignPublicIp) {
            this.assignPublicIp = assignPublicIp;
            return this;
        }
        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder subnets(@Nullable List<String> subnets) {
            this.subnets = subnets;
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }        public ServiceAwsVpcConfiguration build() {
            return new ServiceAwsVpcConfiguration(assignPublicIp, securityGroups, subnets);
        }
    }
}
