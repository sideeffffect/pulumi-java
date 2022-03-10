// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.m365securityandcompliance.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * An access policy entry.
 * 
 */
public final class ServiceAccessPolicyEntryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAccessPolicyEntryArgs Empty = new ServiceAccessPolicyEntryArgs();

    /**
     * An Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
     * 
     */
    @InputImport(name="objectId", required=true)
      private final Input<String> objectId;

    public Input<String> getObjectId() {
        return this.objectId;
    }

    public ServiceAccessPolicyEntryArgs(Input<String> objectId) {
        this.objectId = Objects.requireNonNull(objectId, "expected parameter 'objectId' to be non-null");
    }

    private ServiceAccessPolicyEntryArgs() {
        this.objectId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccessPolicyEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> objectId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccessPolicyEntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectId = defaults.objectId;
        }

        public Builder objectId(Input<String> objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder objectId(String objectId) {
            this.objectId = Input.of(Objects.requireNonNull(objectId));
            return this;
        }
        public ServiceAccessPolicyEntryArgs build() {
            return new ServiceAccessPolicyEntryArgs(objectId);
        }
    }
}
