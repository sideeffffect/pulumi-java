// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement.inputs;

import com.pulumi.azurenative.alertsmanagement.inputs.ConditionsResponse;
import com.pulumi.azurenative.alertsmanagement.inputs.ScopeResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Action rule with diagnostics configuration
 * 
 */
public final class DiagnosticsResponse extends com.pulumi.resources.InvokeArgs {

    public static final DiagnosticsResponse Empty = new DiagnosticsResponse();

    /**
     * conditions on which alerts will be filtered
     * 
     */
    @Import(name="conditions")
    private @Nullable ConditionsResponse conditions;

    public Optional<ConditionsResponse> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * Creation time of action rule. Date-Time in ISO-8601 format.
     * 
     */
    @Import(name="createdAt", required=true)
    private String createdAt;

    public String createdAt() {
        return this.createdAt;
    }

    /**
     * Created by user name.
     * 
     */
    @Import(name="createdBy", required=true)
    private String createdBy;

    public String createdBy() {
        return this.createdBy;
    }

    /**
     * Description of action rule
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Last updated time of action rule. Date-Time in ISO-8601 format.
     * 
     */
    @Import(name="lastModifiedAt", required=true)
    private String lastModifiedAt;

    public String lastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * Last modified by user name.
     * 
     */
    @Import(name="lastModifiedBy", required=true)
    private String lastModifiedBy;

    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * scope on which action rule will apply
     * 
     */
    @Import(name="scope")
    private @Nullable ScopeResponse scope;

    public Optional<ScopeResponse> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * Indicates if the given action rule is enabled or disabled
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Indicates type of action rule
     * Expected value is &#39;Diagnostics&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private DiagnosticsResponse() {}

    private DiagnosticsResponse(DiagnosticsResponse $) {
        this.conditions = $.conditions;
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.description = $.description;
        this.lastModifiedAt = $.lastModifiedAt;
        this.lastModifiedBy = $.lastModifiedBy;
        this.scope = $.scope;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiagnosticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiagnosticsResponse $;

        public Builder() {
            $ = new DiagnosticsResponse();
        }

        public Builder(DiagnosticsResponse defaults) {
            $ = new DiagnosticsResponse(Objects.requireNonNull(defaults));
        }

        public Builder conditions(@Nullable ConditionsResponse conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder createdAt(String createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdBy(String createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder lastModifiedAt(String lastModifiedAt) {
            $.lastModifiedAt = lastModifiedAt;
            return this;
        }

        public Builder lastModifiedBy(String lastModifiedBy) {
            $.lastModifiedBy = lastModifiedBy;
            return this;
        }

        public Builder scope(@Nullable ScopeResponse scope) {
            $.scope = scope;
            return this;
        }

        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public DiagnosticsResponse build() {
            $.createdAt = Objects.requireNonNull($.createdAt, "expected parameter 'createdAt' to be non-null");
            $.createdBy = Objects.requireNonNull($.createdBy, "expected parameter 'createdBy' to be non-null");
            $.lastModifiedAt = Objects.requireNonNull($.lastModifiedAt, "expected parameter 'lastModifiedAt' to be non-null");
            $.lastModifiedBy = Objects.requireNonNull($.lastModifiedBy, "expected parameter 'lastModifiedBy' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
