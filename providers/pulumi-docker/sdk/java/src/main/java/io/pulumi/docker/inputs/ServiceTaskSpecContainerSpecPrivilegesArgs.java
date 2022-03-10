// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.docker.inputs.ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs;
import io.pulumi.docker.inputs.ServiceTaskSpecContainerSpecPrivilegesSeLinuxContextArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecContainerSpecPrivilegesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecContainerSpecPrivilegesArgs Empty = new ServiceTaskSpecContainerSpecPrivilegesArgs();

    @InputImport(name="credentialSpec")
      private final @Nullable Input<ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs> credentialSpec;

    public Input<ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs> getCredentialSpec() {
        return this.credentialSpec == null ? Input.empty() : this.credentialSpec;
    }

    @InputImport(name="seLinuxContext")
      private final @Nullable Input<ServiceTaskSpecContainerSpecPrivilegesSeLinuxContextArgs> seLinuxContext;

    public Input<ServiceTaskSpecContainerSpecPrivilegesSeLinuxContextArgs> getSeLinuxContext() {
        return this.seLinuxContext == null ? Input.empty() : this.seLinuxContext;
    }

    public ServiceTaskSpecContainerSpecPrivilegesArgs(
        @Nullable Input<ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs> credentialSpec,
        @Nullable Input<ServiceTaskSpecContainerSpecPrivilegesSeLinuxContextArgs> seLinuxContext) {
        this.credentialSpec = credentialSpec;
        this.seLinuxContext = seLinuxContext;
    }

    private ServiceTaskSpecContainerSpecPrivilegesArgs() {
        this.credentialSpec = Input.empty();
        this.seLinuxContext = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecPrivilegesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs> credentialSpec;
        private @Nullable Input<ServiceTaskSpecContainerSpecPrivilegesSeLinuxContextArgs> seLinuxContext;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecPrivilegesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentialSpec = defaults.credentialSpec;
    	      this.seLinuxContext = defaults.seLinuxContext;
        }

        public Builder credentialSpec(@Nullable Input<ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs> credentialSpec) {
            this.credentialSpec = credentialSpec;
            return this;
        }

        public Builder credentialSpec(@Nullable ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs credentialSpec) {
            this.credentialSpec = Input.ofNullable(credentialSpec);
            return this;
        }

        public Builder seLinuxContext(@Nullable Input<ServiceTaskSpecContainerSpecPrivilegesSeLinuxContextArgs> seLinuxContext) {
            this.seLinuxContext = seLinuxContext;
            return this;
        }

        public Builder seLinuxContext(@Nullable ServiceTaskSpecContainerSpecPrivilegesSeLinuxContextArgs seLinuxContext) {
            this.seLinuxContext = Input.ofNullable(seLinuxContext);
            return this;
        }
        public ServiceTaskSpecContainerSpecPrivilegesArgs build() {
            return new ServiceTaskSpecContainerSpecPrivilegesArgs(credentialSpec, seLinuxContext);
        }
    }
}
