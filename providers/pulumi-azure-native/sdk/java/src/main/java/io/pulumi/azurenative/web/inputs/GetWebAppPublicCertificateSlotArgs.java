// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppPublicCertificateSlotArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebAppPublicCertificateSlotArgs Empty = new GetWebAppPublicCertificateSlotArgs();

    /**
     * Name of the app.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Public certificate name.
     * 
     */
    @InputImport(name="publicCertificateName", required=true)
      private final String publicCertificateName;

    public String getPublicCertificateName() {
        return this.publicCertificateName;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API the named binding for the production slot.
     * 
     */
    @InputImport(name="slot", required=true)
      private final String slot;

    public String getSlot() {
        return this.slot;
    }

    public GetWebAppPublicCertificateSlotArgs(
        String name,
        String publicCertificateName,
        String resourceGroupName,
        String slot) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.publicCertificateName = Objects.requireNonNull(publicCertificateName, "expected parameter 'publicCertificateName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
    }

    private GetWebAppPublicCertificateSlotArgs() {
        this.name = null;
        this.publicCertificateName = null;
        this.resourceGroupName = null;
        this.slot = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppPublicCertificateSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String publicCertificateName;
        private String resourceGroupName;
        private String slot;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppPublicCertificateSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.publicCertificateName = defaults.publicCertificateName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.slot = defaults.slot;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder publicCertificateName(String publicCertificateName) {
            this.publicCertificateName = Objects.requireNonNull(publicCertificateName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder slot(String slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }
        public GetWebAppPublicCertificateSlotArgs build() {
            return new GetWebAppPublicCertificateSlotArgs(name, publicCertificateName, resourceGroupName, slot);
        }
    }
}
