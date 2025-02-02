// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.aws.sagemaker.inputs.HumanTaskUIUiTemplateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HumanTaskUIArgs extends com.pulumi.resources.ResourceArgs {

    public static final HumanTaskUIArgs Empty = new HumanTaskUIArgs();

    /**
     * The name of the Human Task UI.
     * 
     */
    @Import(name="humanTaskUiName", required=true)
    private Output<String> humanTaskUiName;

    /**
     * @return The name of the Human Task UI.
     * 
     */
    public Output<String> humanTaskUiName() {
        return this.humanTaskUiName;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The Liquid template for the worker user interface. See UI Template below.
     * 
     */
    @Import(name="uiTemplate", required=true)
    private Output<HumanTaskUIUiTemplateArgs> uiTemplate;

    /**
     * @return The Liquid template for the worker user interface. See UI Template below.
     * 
     */
    public Output<HumanTaskUIUiTemplateArgs> uiTemplate() {
        return this.uiTemplate;
    }

    private HumanTaskUIArgs() {}

    private HumanTaskUIArgs(HumanTaskUIArgs $) {
        this.humanTaskUiName = $.humanTaskUiName;
        this.tags = $.tags;
        this.uiTemplate = $.uiTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HumanTaskUIArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HumanTaskUIArgs $;

        public Builder() {
            $ = new HumanTaskUIArgs();
        }

        public Builder(HumanTaskUIArgs defaults) {
            $ = new HumanTaskUIArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param humanTaskUiName The name of the Human Task UI.
         * 
         * @return builder
         * 
         */
        public Builder humanTaskUiName(Output<String> humanTaskUiName) {
            $.humanTaskUiName = humanTaskUiName;
            return this;
        }

        /**
         * @param humanTaskUiName The name of the Human Task UI.
         * 
         * @return builder
         * 
         */
        public Builder humanTaskUiName(String humanTaskUiName) {
            return humanTaskUiName(Output.of(humanTaskUiName));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param uiTemplate The Liquid template for the worker user interface. See UI Template below.
         * 
         * @return builder
         * 
         */
        public Builder uiTemplate(Output<HumanTaskUIUiTemplateArgs> uiTemplate) {
            $.uiTemplate = uiTemplate;
            return this;
        }

        /**
         * @param uiTemplate The Liquid template for the worker user interface. See UI Template below.
         * 
         * @return builder
         * 
         */
        public Builder uiTemplate(HumanTaskUIUiTemplateArgs uiTemplate) {
            return uiTemplate(Output.of(uiTemplate));
        }

        public HumanTaskUIArgs build() {
            $.humanTaskUiName = Objects.requireNonNull($.humanTaskUiName, "expected parameter 'humanTaskUiName' to be non-null");
            $.uiTemplate = Objects.requireNonNull($.uiTemplate, "expected parameter 'uiTemplate' to be non-null");
            return $;
        }
    }

}
