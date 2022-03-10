// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebAppSwiftVirtualNetworkConnectionResult {
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * The Virtual Network subnet's resource ID. This is the subnet that this Web App will join. This subnet must have a delegation to Microsoft.Web/serverFarms defined first.
     * 
     */
    private final @Nullable String subnetResourceId;
    /**
     * A flag that specifies if the scale unit this Web App is on supports Swift integration.
     * 
     */
    private final @Nullable Boolean swiftSupported;
    /**
     * The system metadata relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetWebAppSwiftVirtualNetworkConnectionResult(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("kind") @Nullable String kind,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("subnetResourceId") @Nullable String subnetResourceId,
        @OutputCustomType.Parameter("swiftSupported") @Nullable Boolean swiftSupported,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("type") String type) {
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.subnetResourceId = subnetResourceId;
        this.swiftSupported = swiftSupported;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Resource Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The Virtual Network subnet's resource ID. This is the subnet that this Web App will join. This subnet must have a delegation to Microsoft.Web/serverFarms defined first.
     * 
    */
    public Optional<String> getSubnetResourceId() {
        return Optional.ofNullable(this.subnetResourceId);
    }
    /**
     * A flag that specifies if the scale unit this Web App is on supports Swift integration.
     * 
    */
    public Optional<Boolean> getSwiftSupported() {
        return Optional.ofNullable(this.swiftSupported);
    }
    /**
     * The system metadata relating to this resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppSwiftVirtualNetworkConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String kind;
        private String name;
        private @Nullable String subnetResourceId;
        private @Nullable Boolean swiftSupported;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppSwiftVirtualNetworkConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.subnetResourceId = defaults.subnetResourceId;
    	      this.swiftSupported = defaults.swiftSupported;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder subnetResourceId(@Nullable String subnetResourceId) {
            this.subnetResourceId = subnetResourceId;
            return this;
        }

        public Builder swiftSupported(@Nullable Boolean swiftSupported) {
            this.swiftSupported = swiftSupported;
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
        public GetWebAppSwiftVirtualNetworkConnectionResult build() {
            return new GetWebAppSwiftVirtualNetworkConnectionResult(id, kind, name, subnetResourceId, swiftSupported, systemData, type);
        }
    }
}
