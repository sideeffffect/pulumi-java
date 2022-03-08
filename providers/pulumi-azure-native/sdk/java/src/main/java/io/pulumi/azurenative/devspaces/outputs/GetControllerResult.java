// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devspaces.outputs;

import io.pulumi.azurenative.devspaces.outputs.SkuResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetControllerResult {
    /**
     * DNS name for accessing DataPlane services
     * 
     */
    private final String dataPlaneFqdn;
    /**
     * DNS suffix for public endpoints running in the Azure Dev Spaces Controller.
     * 
     */
    private final String hostSuffix;
    /**
     * Fully qualified resource Id for the resource.
     * 
     */
    private final String id;
    /**
     * Region where the Azure resource is located.
     * 
     */
    private final String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * Provisioning state of the Azure Dev Spaces Controller.
     * 
     */
    private final String provisioningState;
    /**
     * Model representing SKU for Azure Dev Spaces Controller.
     * 
     */
    private final SkuResponse sku;
    /**
     * Tags for the Azure resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * DNS of the target container host's API server
     * 
     */
    private final String targetContainerHostApiServerFqdn;
    /**
     * Resource ID of the target container host
     * 
     */
    private final String targetContainerHostResourceId;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"dataPlaneFqdn","hostSuffix","id","location","name","provisioningState","sku","tags","targetContainerHostApiServerFqdn","targetContainerHostResourceId","type"})
    private GetControllerResult(
        String dataPlaneFqdn,
        String hostSuffix,
        String id,
        String location,
        String name,
        String provisioningState,
        SkuResponse sku,
        @Nullable Map<String,String> tags,
        String targetContainerHostApiServerFqdn,
        String targetContainerHostResourceId,
        String type) {
        this.dataPlaneFqdn = dataPlaneFqdn;
        this.hostSuffix = hostSuffix;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.sku = sku;
        this.tags = tags;
        this.targetContainerHostApiServerFqdn = targetContainerHostApiServerFqdn;
        this.targetContainerHostResourceId = targetContainerHostResourceId;
        this.type = type;
    }

    /**
     * DNS name for accessing DataPlane services
     * 
    */
    public String getDataPlaneFqdn() {
        return this.dataPlaneFqdn;
    }
    /**
     * DNS suffix for public endpoints running in the Azure Dev Spaces Controller.
     * 
    */
    public String getHostSuffix() {
        return this.hostSuffix;
    }
    /**
     * Fully qualified resource Id for the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Region where the Azure resource is located.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state of the Azure Dev Spaces Controller.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Model representing SKU for Azure Dev Spaces Controller.
     * 
    */
    public SkuResponse getSku() {
        return this.sku;
    }
    /**
     * Tags for the Azure resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * DNS of the target container host's API server
     * 
    */
    public String getTargetContainerHostApiServerFqdn() {
        return this.targetContainerHostApiServerFqdn;
    }
    /**
     * Resource ID of the target container host
     * 
    */
    public String getTargetContainerHostResourceId() {
        return this.targetContainerHostResourceId;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetControllerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataPlaneFqdn;
        private String hostSuffix;
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String targetContainerHostApiServerFqdn;
        private String targetContainerHostResourceId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetControllerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataPlaneFqdn = defaults.dataPlaneFqdn;
    	      this.hostSuffix = defaults.hostSuffix;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.targetContainerHostApiServerFqdn = defaults.targetContainerHostApiServerFqdn;
    	      this.targetContainerHostResourceId = defaults.targetContainerHostResourceId;
    	      this.type = defaults.type;
        }

        public Builder setDataPlaneFqdn(String dataPlaneFqdn) {
            this.dataPlaneFqdn = Objects.requireNonNull(dataPlaneFqdn);
            return this;
        }

        public Builder setHostSuffix(String hostSuffix) {
            this.hostSuffix = Objects.requireNonNull(hostSuffix);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTargetContainerHostApiServerFqdn(String targetContainerHostApiServerFqdn) {
            this.targetContainerHostApiServerFqdn = Objects.requireNonNull(targetContainerHostApiServerFqdn);
            return this;
        }

        public Builder setTargetContainerHostResourceId(String targetContainerHostResourceId) {
            this.targetContainerHostResourceId = Objects.requireNonNull(targetContainerHostResourceId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetControllerResult build() {
            return new GetControllerResult(dataPlaneFqdn, hostSuffix, id, location, name, provisioningState, sku, tags, targetContainerHostApiServerFqdn, targetContainerHostResourceId, type);
        }
    }
}
