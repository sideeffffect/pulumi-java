// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetArtifactResult {
    /**
     * String Id used to locate any resource on Azure.
     * 
     */
    private final String id;
    /**
     * Specifies the kind of blueprint artifact.
     * 
     */
    private final String kind;
    /**
     * Name of this resource.
     * 
     */
    private final String name;
    /**
     * Type of this resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","kind","name","type"})
    private GetArtifactResult(
        String id,
        String kind,
        String name,
        String type) {
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.type = type;
    }

    /**
     * String Id used to locate any resource on Azure.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Specifies the kind of blueprint artifact.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of this resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Type of this resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetArtifactResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String kind;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetArtifactResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
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

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetArtifactResult build() {
            return new GetArtifactResult(id, kind, name, type);
        }
    }
}
