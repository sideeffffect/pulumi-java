// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Name value pair.
 * 
 */
public final class NameValuePairResponse extends com.pulumi.resources.InvokeArgs {

    public static final NameValuePairResponse Empty = new NameValuePairResponse();

    /**
     * Pair name.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Pair value.
     * 
     */
    @Import(name="value")
      private final @Nullable String value;

    public Optional<String> value() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public NameValuePairResponse(
        @Nullable String name,
        @Nullable String value) {
        this.name = name;
        this.value = value;
    }

    private NameValuePairResponse() {
        this.name = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NameValuePairResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(NameValuePairResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public NameValuePairResponse build() {
            return new NameValuePairResponse(name, value);
        }
    }
}
