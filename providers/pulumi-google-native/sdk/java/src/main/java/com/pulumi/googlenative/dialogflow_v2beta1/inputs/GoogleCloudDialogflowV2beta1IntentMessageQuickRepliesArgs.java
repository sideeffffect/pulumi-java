// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The quick replies response message.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesArgs();

    /**
     * Optional. The collection of quick replies.
     * 
     */
    @Import(name="quickReplies")
    private @Nullable Output<List<String>> quickReplies;

    /**
     * @return Optional. The collection of quick replies.
     * 
     */
    public Optional<Output<List<String>>> quickReplies() {
        return Optional.ofNullable(this.quickReplies);
    }

    /**
     * Optional. The title of the collection of quick replies.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Optional. The title of the collection of quick replies.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesArgs() {}

    private GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesArgs(GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesArgs $) {
        this.quickReplies = $.quickReplies;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param quickReplies Optional. The collection of quick replies.
         * 
         * @return builder
         * 
         */
        public Builder quickReplies(@Nullable Output<List<String>> quickReplies) {
            $.quickReplies = quickReplies;
            return this;
        }

        /**
         * @param quickReplies Optional. The collection of quick replies.
         * 
         * @return builder
         * 
         */
        public Builder quickReplies(List<String> quickReplies) {
            return quickReplies(Output.of(quickReplies));
        }

        /**
         * @param quickReplies Optional. The collection of quick replies.
         * 
         * @return builder
         * 
         */
        public Builder quickReplies(String... quickReplies) {
            return quickReplies(List.of(quickReplies));
        }

        /**
         * @param title Optional. The title of the collection of quick replies.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Optional. The title of the collection of quick replies.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesArgs build() {
            return $;
        }
    }

}
