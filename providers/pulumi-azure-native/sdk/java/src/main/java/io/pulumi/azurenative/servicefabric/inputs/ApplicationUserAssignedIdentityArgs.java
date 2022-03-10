// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ApplicationUserAssignedIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationUserAssignedIdentityArgs Empty = new ApplicationUserAssignedIdentityArgs();

    /**
     * The friendly name of user assigned identity.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The principal id of user assigned identity.
     * 
     */
    @InputImport(name="principalId", required=true)
      private final Input<String> principalId;

    public Input<String> getPrincipalId() {
        return this.principalId;
    }

    public ApplicationUserAssignedIdentityArgs(
        Input<String> name,
        Input<String> principalId) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
    }

    private ApplicationUserAssignedIdentityArgs() {
        this.name = Input.empty();
        this.principalId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationUserAssignedIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<String> principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationUserAssignedIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.principalId = defaults.principalId;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder principalId(Input<String> principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder principalId(String principalId) {
            this.principalId = Input.of(Objects.requireNonNull(principalId));
            return this;
        }
        public ApplicationUserAssignedIdentityArgs build() {
            return new ApplicationUserAssignedIdentityArgs(name, principalId);
        }
    }
}
