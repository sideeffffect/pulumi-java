// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.azurenative.appplatform.outputs.GatewayPropertiesResponse;
import io.pulumi.azurenative.appplatform.outputs.SkuResponse;
import io.pulumi.azurenative.appplatform.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGatewayResult {
    /**
     * Fully qualified resource Id for the resource.
     * 
     */
    private final String id;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * Spring Cloud Gateway properties payload
     * 
     */
    private final GatewayPropertiesResponse properties;
    /**
     * Sku of the Spring Cloud Gateway resource
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetGatewayResult(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("properties") GatewayPropertiesResponse properties,
        @OutputCustomType.Parameter("sku") @Nullable SkuResponse sku,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.sku = sku;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Fully qualified resource Id for the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Spring Cloud Gateway properties payload
     * 
    */
    public GatewayPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Sku of the Spring Cloud Gateway resource
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
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

    public static Builder builder(GetGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private GatewayPropertiesResponse properties;
        private @Nullable SkuResponse sku;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.sku = defaults.sku;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder properties(GatewayPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetGatewayResult build() {
            return new GetGatewayResult(id, name, properties, sku, systemData, type);
        }
    }
}
