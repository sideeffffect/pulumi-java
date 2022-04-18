// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.solutions.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JitApproverDefinitionResponse {
    /**
     * The approver display name.
     * 
     */
    private final @Nullable String displayName;
    /**
     * The approver service principal Id.
     * 
     */
    private final String id;
    /**
     * The approver type.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private JitApproverDefinitionResponse(
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("type") @Nullable String type) {
        this.displayName = displayName;
        this.id = id;
        this.type = type;
    }

    /**
     * The approver display name.
     * 
    */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The approver service principal Id.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The approver type.
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JitApproverDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private String id;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JitApproverDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public JitApproverDefinitionResponse build() {
            return new JitApproverDefinitionResponse(displayName, id, type);
        }
    }
}
