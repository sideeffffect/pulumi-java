// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The definition of a canonical profile property.
 * 
 */
public final class CanonicalProfileDefinitionResponseProperties extends com.pulumi.resources.InvokeArgs {

    public static final CanonicalProfileDefinitionResponseProperties Empty = new CanonicalProfileDefinitionResponseProperties();

    /**
     * Profile name.
     * 
     */
    @Import(name="profileName")
      private final @Nullable String profileName;

    public Optional<String> profileName() {
        return this.profileName == null ? Optional.empty() : Optional.ofNullable(this.profileName);
    }

    /**
     * Property name of profile.
     * 
     */
    @Import(name="profilePropertyName")
      private final @Nullable String profilePropertyName;

    public Optional<String> profilePropertyName() {
        return this.profilePropertyName == null ? Optional.empty() : Optional.ofNullable(this.profilePropertyName);
    }

    /**
     * The rank.
     * 
     */
    @Import(name="rank")
      private final @Nullable Integer rank;

    public Optional<Integer> rank() {
        return this.rank == null ? Optional.empty() : Optional.ofNullable(this.rank);
    }

    /**
     * Type of canonical property value.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> type() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * Value of the canonical property.
     * 
     */
    @Import(name="value")
      private final @Nullable String value;

    public Optional<String> value() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public CanonicalProfileDefinitionResponseProperties(
        @Nullable String profileName,
        @Nullable String profilePropertyName,
        @Nullable Integer rank,
        @Nullable String type,
        @Nullable String value) {
        this.profileName = profileName;
        this.profilePropertyName = profilePropertyName;
        this.rank = rank;
        this.type = type;
        this.value = value;
    }

    private CanonicalProfileDefinitionResponseProperties() {
        this.profileName = null;
        this.profilePropertyName = null;
        this.rank = null;
        this.type = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanonicalProfileDefinitionResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String profileName;
        private @Nullable String profilePropertyName;
        private @Nullable Integer rank;
        private @Nullable String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(CanonicalProfileDefinitionResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.profileName = defaults.profileName;
    	      this.profilePropertyName = defaults.profilePropertyName;
    	      this.rank = defaults.rank;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder profileName(@Nullable String profileName) {
            this.profileName = profileName;
            return this;
        }
        public Builder profilePropertyName(@Nullable String profilePropertyName) {
            this.profilePropertyName = profilePropertyName;
            return this;
        }
        public Builder rank(@Nullable Integer rank) {
            this.rank = rank;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public CanonicalProfileDefinitionResponseProperties build() {
            return new CanonicalProfileDefinitionResponseProperties(profileName, profilePropertyName, rank, type, value);
        }
    }
}
