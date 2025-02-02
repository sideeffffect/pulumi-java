// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.inputs.SetValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a encoded task step.
 * 
 */
public final class EncodedTaskStepArgs extends com.pulumi.resources.ResourceArgs {

    public static final EncodedTaskStepArgs Empty = new EncodedTaskStepArgs();

    /**
     * The token (git PAT or SAS token of storage account blob) associated with the context for a step.
     * 
     */
    @Import(name="contextAccessToken")
    private @Nullable Output<String> contextAccessToken;

    /**
     * @return The token (git PAT or SAS token of storage account blob) associated with the context for a step.
     * 
     */
    public Optional<Output<String>> contextAccessToken() {
        return Optional.ofNullable(this.contextAccessToken);
    }

    /**
     * The URL(absolute or relative) of the source context for the task step.
     * 
     */
    @Import(name="contextPath")
    private @Nullable Output<String> contextPath;

    /**
     * @return The URL(absolute or relative) of the source context for the task step.
     * 
     */
    public Optional<Output<String>> contextPath() {
        return Optional.ofNullable(this.contextPath);
    }

    /**
     * Base64 encoded value of the template/definition file content.
     * 
     */
    @Import(name="encodedTaskContent", required=true)
    private Output<String> encodedTaskContent;

    /**
     * @return Base64 encoded value of the template/definition file content.
     * 
     */
    public Output<String> encodedTaskContent() {
        return this.encodedTaskContent;
    }

    /**
     * Base64 encoded value of the parameters/values file content.
     * 
     */
    @Import(name="encodedValuesContent")
    private @Nullable Output<String> encodedValuesContent;

    /**
     * @return Base64 encoded value of the parameters/values file content.
     * 
     */
    public Optional<Output<String>> encodedValuesContent() {
        return Optional.ofNullable(this.encodedValuesContent);
    }

    /**
     * The type of the step.
     * Expected value is &#39;EncodedTask&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the step.
     * Expected value is &#39;EncodedTask&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The collection of overridable values that can be passed when running a task.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<SetValueArgs>> values;

    /**
     * @return The collection of overridable values that can be passed when running a task.
     * 
     */
    public Optional<Output<List<SetValueArgs>>> values() {
        return Optional.ofNullable(this.values);
    }

    private EncodedTaskStepArgs() {}

    private EncodedTaskStepArgs(EncodedTaskStepArgs $) {
        this.contextAccessToken = $.contextAccessToken;
        this.contextPath = $.contextPath;
        this.encodedTaskContent = $.encodedTaskContent;
        this.encodedValuesContent = $.encodedValuesContent;
        this.type = $.type;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncodedTaskStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncodedTaskStepArgs $;

        public Builder() {
            $ = new EncodedTaskStepArgs();
        }

        public Builder(EncodedTaskStepArgs defaults) {
            $ = new EncodedTaskStepArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contextAccessToken The token (git PAT or SAS token of storage account blob) associated with the context for a step.
         * 
         * @return builder
         * 
         */
        public Builder contextAccessToken(@Nullable Output<String> contextAccessToken) {
            $.contextAccessToken = contextAccessToken;
            return this;
        }

        /**
         * @param contextAccessToken The token (git PAT or SAS token of storage account blob) associated with the context for a step.
         * 
         * @return builder
         * 
         */
        public Builder contextAccessToken(String contextAccessToken) {
            return contextAccessToken(Output.of(contextAccessToken));
        }

        /**
         * @param contextPath The URL(absolute or relative) of the source context for the task step.
         * 
         * @return builder
         * 
         */
        public Builder contextPath(@Nullable Output<String> contextPath) {
            $.contextPath = contextPath;
            return this;
        }

        /**
         * @param contextPath The URL(absolute or relative) of the source context for the task step.
         * 
         * @return builder
         * 
         */
        public Builder contextPath(String contextPath) {
            return contextPath(Output.of(contextPath));
        }

        /**
         * @param encodedTaskContent Base64 encoded value of the template/definition file content.
         * 
         * @return builder
         * 
         */
        public Builder encodedTaskContent(Output<String> encodedTaskContent) {
            $.encodedTaskContent = encodedTaskContent;
            return this;
        }

        /**
         * @param encodedTaskContent Base64 encoded value of the template/definition file content.
         * 
         * @return builder
         * 
         */
        public Builder encodedTaskContent(String encodedTaskContent) {
            return encodedTaskContent(Output.of(encodedTaskContent));
        }

        /**
         * @param encodedValuesContent Base64 encoded value of the parameters/values file content.
         * 
         * @return builder
         * 
         */
        public Builder encodedValuesContent(@Nullable Output<String> encodedValuesContent) {
            $.encodedValuesContent = encodedValuesContent;
            return this;
        }

        /**
         * @param encodedValuesContent Base64 encoded value of the parameters/values file content.
         * 
         * @return builder
         * 
         */
        public Builder encodedValuesContent(String encodedValuesContent) {
            return encodedValuesContent(Output.of(encodedValuesContent));
        }

        /**
         * @param type The type of the step.
         * Expected value is &#39;EncodedTask&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the step.
         * Expected value is &#39;EncodedTask&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param values The collection of overridable values that can be passed when running a task.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<SetValueArgs>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The collection of overridable values that can be passed when running a task.
         * 
         * @return builder
         * 
         */
        public Builder values(List<SetValueArgs> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The collection of overridable values that can be passed when running a task.
         * 
         * @return builder
         * 
         */
        public Builder values(SetValueArgs... values) {
            return values(List.of(values));
        }

        public EncodedTaskStepArgs build() {
            $.encodedTaskContent = Objects.requireNonNull($.encodedTaskContent, "expected parameter 'encodedTaskContent' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
