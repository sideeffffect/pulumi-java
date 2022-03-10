// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes properties of an component as related to the standard
 * 
 */
public final class StandardComponentPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final StandardComponentPropertiesArgs Empty = new StandardComponentPropertiesArgs();

    /**
     * Component Key matching componentMetadata
     * 
     */
    @InputImport(name="key")
      private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    public StandardComponentPropertiesArgs(@Nullable Input<String> key) {
        this.key = key;
    }

    private StandardComponentPropertiesArgs() {
        this.key = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardComponentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> key;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardComponentPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
        }

        public Builder key(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }
        public StandardComponentPropertiesArgs build() {
            return new StandardComponentPropertiesArgs(key);
        }
    }
}
