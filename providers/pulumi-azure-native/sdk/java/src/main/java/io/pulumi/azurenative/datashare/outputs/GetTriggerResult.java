// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetTriggerResult {
    /**
     * The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * Kind of synchronization on trigger.
     * 
     */
    private final String kind;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
    /**
     * System Data of the Azure resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Type of the azure resource
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","kind","name","systemData","type"})
    private GetTriggerResult(
        String id,
        String kind,
        String name,
        SystemDataResponse systemData,
        String type) {
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * The resource id of the azure resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of synchronization on trigger.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * System Data of the Azure resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Type of the azure resource
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String kind;
        private String name;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTriggerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetTriggerResult build() {
            return new GetTriggerResult(id, kind, name, systemData, type);
        }
    }
}
