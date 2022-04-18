// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CaaRecordResponse {
    /**
     * The flags for this CAA record as an integer between 0 and 255.
     * 
     */
    private final @Nullable Integer flags;
    /**
     * The tag for this CAA record.
     * 
     */
    private final @Nullable String tag;
    /**
     * The value for this CAA record.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private CaaRecordResponse(
        @CustomType.Parameter("flags") @Nullable Integer flags,
        @CustomType.Parameter("tag") @Nullable String tag,
        @CustomType.Parameter("value") @Nullable String value) {
        this.flags = flags;
        this.tag = tag;
        this.value = value;
    }

    /**
     * The flags for this CAA record as an integer between 0 and 255.
     * 
    */
    public Optional<Integer> flags() {
        return Optional.ofNullable(this.flags);
    }
    /**
     * The tag for this CAA record.
     * 
    */
    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }
    /**
     * The value for this CAA record.
     * 
    */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaaRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer flags;
        private @Nullable String tag;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(CaaRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flags = defaults.flags;
    	      this.tag = defaults.tag;
    	      this.value = defaults.value;
        }

        public Builder flags(@Nullable Integer flags) {
            this.flags = flags;
            return this;
        }
        public Builder tag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public CaaRecordResponse build() {
            return new CaaRecordResponse(flags, tag, value);
        }
    }
}
