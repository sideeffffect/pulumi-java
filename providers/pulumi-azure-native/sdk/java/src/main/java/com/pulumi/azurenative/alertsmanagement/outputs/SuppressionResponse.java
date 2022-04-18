// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement.outputs;

import com.pulumi.azurenative.alertsmanagement.outputs.ConditionsResponse;
import com.pulumi.azurenative.alertsmanagement.outputs.ScopeResponse;
import com.pulumi.azurenative.alertsmanagement.outputs.SuppressionConfigResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SuppressionResponse {
    /**
     * conditions on which alerts will be filtered
     * 
     */
    private final @Nullable ConditionsResponse conditions;
    /**
     * Creation time of action rule. Date-Time in ISO-8601 format.
     * 
     */
    private final String createdAt;
    /**
     * Created by user name.
     * 
     */
    private final String createdBy;
    /**
     * Description of action rule
     * 
     */
    private final @Nullable String description;
    /**
     * Last updated time of action rule. Date-Time in ISO-8601 format.
     * 
     */
    private final String lastModifiedAt;
    /**
     * Last modified by user name.
     * 
     */
    private final String lastModifiedBy;
    /**
     * scope on which action rule will apply
     * 
     */
    private final @Nullable ScopeResponse scope;
    /**
     * Indicates if the given action rule is enabled or disabled
     * 
     */
    private final @Nullable String status;
    /**
     * suppression configuration for the action rule
     * 
     */
    private final SuppressionConfigResponse suppressionConfig;
    /**
     * Indicates type of action rule
     * Expected value is 'Suppression'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private SuppressionResponse(
        @CustomType.Parameter("conditions") @Nullable ConditionsResponse conditions,
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("createdBy") String createdBy,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("lastModifiedAt") String lastModifiedAt,
        @CustomType.Parameter("lastModifiedBy") String lastModifiedBy,
        @CustomType.Parameter("scope") @Nullable ScopeResponse scope,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("suppressionConfig") SuppressionConfigResponse suppressionConfig,
        @CustomType.Parameter("type") String type) {
        this.conditions = conditions;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.description = description;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.scope = scope;
        this.status = status;
        this.suppressionConfig = suppressionConfig;
        this.type = type;
    }

    /**
     * conditions on which alerts will be filtered
     * 
    */
    public Optional<ConditionsResponse> conditions() {
        return Optional.ofNullable(this.conditions);
    }
    /**
     * Creation time of action rule. Date-Time in ISO-8601 format.
     * 
    */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * Created by user name.
     * 
    */
    public String createdBy() {
        return this.createdBy;
    }
    /**
     * Description of action rule
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Last updated time of action rule. Date-Time in ISO-8601 format.
     * 
    */
    public String lastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * Last modified by user name.
     * 
    */
    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * scope on which action rule will apply
     * 
    */
    public Optional<ScopeResponse> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * Indicates if the given action rule is enabled or disabled
     * 
    */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * suppression configuration for the action rule
     * 
    */
    public SuppressionConfigResponse suppressionConfig() {
        return this.suppressionConfig;
    }
    /**
     * Indicates type of action rule
     * Expected value is 'Suppression'.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SuppressionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConditionsResponse conditions;
        private String createdAt;
        private String createdBy;
        private @Nullable String description;
        private String lastModifiedAt;
        private String lastModifiedBy;
        private @Nullable ScopeResponse scope;
        private @Nullable String status;
        private SuppressionConfigResponse suppressionConfig;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SuppressionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.description = defaults.description;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.scope = defaults.scope;
    	      this.status = defaults.status;
    	      this.suppressionConfig = defaults.suppressionConfig;
    	      this.type = defaults.type;
        }

        public Builder conditions(@Nullable ConditionsResponse conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder createdBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder lastModifiedAt(String lastModifiedAt) {
            this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
            return this;
        }
        public Builder lastModifiedBy(String lastModifiedBy) {
            this.lastModifiedBy = Objects.requireNonNull(lastModifiedBy);
            return this;
        }
        public Builder scope(@Nullable ScopeResponse scope) {
            this.scope = scope;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder suppressionConfig(SuppressionConfigResponse suppressionConfig) {
            this.suppressionConfig = Objects.requireNonNull(suppressionConfig);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SuppressionResponse build() {
            return new SuppressionResponse(conditions, createdAt, createdBy, description, lastModifiedAt, lastModifiedBy, scope, status, suppressionConfig, type);
        }
    }
}
