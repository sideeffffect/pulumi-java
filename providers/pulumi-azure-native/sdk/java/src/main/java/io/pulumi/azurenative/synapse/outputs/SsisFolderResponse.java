// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SsisFolderResponse {
    /**
     * Metadata description.
     * 
     */
    private final @Nullable String description;
    /**
     * Metadata id.
     * 
     */
    private final @Nullable Double id;
    /**
     * Metadata name.
     * 
     */
    private final @Nullable String name;
    /**
     * The type of SSIS object metadata.
     * Expected value is 'Folder'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"description","id","name","type"})
    private SsisFolderResponse(
        @Nullable String description,
        @Nullable Double id,
        @Nullable String name,
        String type) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.type = type;
    }

    /**
     * Metadata description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Metadata id.
     * 
    */
    public Optional<Double> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Metadata name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The type of SSIS object metadata.
     * Expected value is 'Folder'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsisFolderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Double id;
        private @Nullable String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SsisFolderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(@Nullable Double id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SsisFolderResponse build() {
            return new SsisFolderResponse(description, id, name, type);
        }
    }
}
