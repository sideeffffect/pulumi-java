// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxVersionArgs Empty = new CxVersionArgs();

    /**
     * The description of the version. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The human-readable name of the version. Limit of 64 characters.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * The Flow to create an Version for.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>.
     * 
     */
    @InputImport(name="parent")
      private final @Nullable Input<String> parent;

    public Input<String> getParent() {
        return this.parent == null ? Input.empty() : this.parent;
    }

    public CxVersionArgs(
        @Nullable Input<String> description,
        Input<String> displayName,
        @Nullable Input<String> parent) {
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.parent = parent;
    }

    private CxVersionArgs() {
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.parent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> displayName;
        private @Nullable Input<String> parent;

        public Builder() {
    	      // Empty
        }

        public Builder(CxVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.parent = defaults.parent;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder displayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder parent(@Nullable Input<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder parent(@Nullable String parent) {
            this.parent = Input.ofNullable(parent);
            return this;
        }
        public CxVersionArgs build() {
            return new CxVersionArgs(description, displayName, parent);
        }
    }
}
