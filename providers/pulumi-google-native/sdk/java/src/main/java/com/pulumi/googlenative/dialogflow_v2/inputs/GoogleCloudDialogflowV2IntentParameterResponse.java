// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents intent parameters.
 * 
 */
public final class GoogleCloudDialogflowV2IntentParameterResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2IntentParameterResponse Empty = new GoogleCloudDialogflowV2IntentParameterResponse();

    /**
     * Optional. The default value to use when the `value` yields an empty result. Default values can be extracted from contexts by using the following syntax: `#context_name.parameter_name`.
     * 
     */
    @Import(name="defaultValue", required=true)
    private String defaultValue;

    public String defaultValue() {
        return this.defaultValue;
    }

    /**
     * The name of the parameter.
     * 
     */
    @Import(name="displayName", required=true)
    private String displayName;

    public String displayName() {
        return this.displayName;
    }

    /**
     * Optional. The name of the entity type, prefixed with `@`, that describes values of the parameter. If the parameter is required, this must be provided.
     * 
     */
    @Import(name="entityTypeDisplayName", required=true)
    private String entityTypeDisplayName;

    public String entityTypeDisplayName() {
        return this.entityTypeDisplayName;
    }

    /**
     * Optional. Indicates whether the parameter represents a list of values.
     * 
     */
    @Import(name="isList", required=true)
    private Boolean isList;

    public Boolean isList() {
        return this.isList;
    }

    /**
     * Optional. Indicates whether the parameter is required. That is, whether the intent cannot be completed without collecting the parameter value.
     * 
     */
    @Import(name="mandatory", required=true)
    private Boolean mandatory;

    public Boolean mandatory() {
        return this.mandatory;
    }

    /**
     * The unique identifier of this parameter.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Optional. The collection of prompts that the agent can present to the user in order to collect a value for the parameter.
     * 
     */
    @Import(name="prompts", required=true)
    private List<String> prompts;

    public List<String> prompts() {
        return this.prompts;
    }

    /**
     * Optional. The definition of the parameter value. It can be: - a constant string, - a parameter value defined as `$parameter_name`, - an original parameter value defined as `$parameter_name.original`, - a parameter value from some context defined as `#context_name.parameter_name`.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private GoogleCloudDialogflowV2IntentParameterResponse() {}

    private GoogleCloudDialogflowV2IntentParameterResponse(GoogleCloudDialogflowV2IntentParameterResponse $) {
        this.defaultValue = $.defaultValue;
        this.displayName = $.displayName;
        this.entityTypeDisplayName = $.entityTypeDisplayName;
        this.isList = $.isList;
        this.mandatory = $.mandatory;
        this.name = $.name;
        this.prompts = $.prompts;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2IntentParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentParameterResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2IntentParameterResponse();
        }

        public Builder(GoogleCloudDialogflowV2IntentParameterResponse defaults) {
            $ = new GoogleCloudDialogflowV2IntentParameterResponse(Objects.requireNonNull(defaults));
        }

        public Builder defaultValue(String defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        public Builder displayName(String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder entityTypeDisplayName(String entityTypeDisplayName) {
            $.entityTypeDisplayName = entityTypeDisplayName;
            return this;
        }

        public Builder isList(Boolean isList) {
            $.isList = isList;
            return this;
        }

        public Builder mandatory(Boolean mandatory) {
            $.mandatory = mandatory;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder prompts(List<String> prompts) {
            $.prompts = prompts;
            return this;
        }

        public Builder prompts(String... prompts) {
            return prompts(List.of(prompts));
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public GoogleCloudDialogflowV2IntentParameterResponse build() {
            $.defaultValue = Objects.requireNonNull($.defaultValue, "expected parameter 'defaultValue' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.entityTypeDisplayName = Objects.requireNonNull($.entityTypeDisplayName, "expected parameter 'entityTypeDisplayName' to be non-null");
            $.isList = Objects.requireNonNull($.isList, "expected parameter 'isList' to be non-null");
            $.mandatory = Objects.requireNonNull($.mandatory, "expected parameter 'mandatory' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.prompts = Objects.requireNonNull($.prompts, "expected parameter 'prompts' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
