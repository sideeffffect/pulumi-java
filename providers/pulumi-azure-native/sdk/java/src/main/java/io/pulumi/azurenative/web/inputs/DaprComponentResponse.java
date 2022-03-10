// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.DaprMetadataResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Dapr component configuration
 * 
 */
public final class DaprComponentResponse extends io.pulumi.resources.InvokeArgs {

    public static final DaprComponentResponse Empty = new DaprComponentResponse();

    /**
     * Component metadata
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable List<DaprMetadataResponse> metadata;

    public List<DaprMetadataResponse> getMetadata() {
        return this.metadata == null ? List.of() : this.metadata;
    }

    /**
     * Component name
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Component type
     * 
     */
    @InputImport(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * Component version
     * 
     */
    @InputImport(name="version")
      private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public DaprComponentResponse(
        @Nullable List<DaprMetadataResponse> metadata,
        @Nullable String name,
        @Nullable String type,
        @Nullable String version) {
        this.metadata = metadata;
        this.name = name;
        this.type = type;
        this.version = version;
    }

    private DaprComponentResponse() {
        this.metadata = List.of();
        this.name = null;
        this.type = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaprComponentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DaprMetadataResponse> metadata;
        private @Nullable String name;
        private @Nullable String type;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(DaprComponentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder metadata(@Nullable List<DaprMetadataResponse> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public DaprComponentResponse build() {
            return new DaprComponentResponse(metadata, name, type, version);
        }
    }
}
