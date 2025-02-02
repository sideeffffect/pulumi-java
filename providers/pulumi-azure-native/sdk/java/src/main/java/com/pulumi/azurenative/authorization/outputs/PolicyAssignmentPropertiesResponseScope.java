// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyAssignmentPropertiesResponseScope {
    /**
     * @return Display name of the resource
     * 
     */
    private final @Nullable String displayName;
    /**
     * @return Scope id of the resource
     * 
     */
    private final @Nullable String id;
    /**
     * @return Type of the resource
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private PolicyAssignmentPropertiesResponseScope(
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("type") @Nullable String type) {
        this.displayName = displayName;
        this.id = id;
        this.type = type;
    }

    /**
     * @return Display name of the resource
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return Scope id of the resource
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Type of the resource
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAssignmentPropertiesResponseScope defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable String id;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAssignmentPropertiesResponseScope defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public PolicyAssignmentPropertiesResponseScope build() {
            return new PolicyAssignmentPropertiesResponseScope(displayName, id, type);
        }
    }
}
