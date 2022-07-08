// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetTagsItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetTagsItemArgs Empty = new DatasetTagsItemArgs();

    /**
     * [Required] The namespaced friendly name of the tag key, e.g. &#34;12345/environment&#34; where 12345 is org id.
     * 
     */
    @Import(name="tagKey")
    private @Nullable Output<String> tagKey;

    /**
     * @return [Required] The namespaced friendly name of the tag key, e.g. &#34;12345/environment&#34; where 12345 is org id.
     * 
     */
    public Optional<Output<String>> tagKey() {
        return Optional.ofNullable(this.tagKey);
    }

    /**
     * [Required] Friendly short name of the tag value, e.g. &#34;production&#34;.
     * 
     */
    @Import(name="tagValue")
    private @Nullable Output<String> tagValue;

    /**
     * @return [Required] Friendly short name of the tag value, e.g. &#34;production&#34;.
     * 
     */
    public Optional<Output<String>> tagValue() {
        return Optional.ofNullable(this.tagValue);
    }

    private DatasetTagsItemArgs() {}

    private DatasetTagsItemArgs(DatasetTagsItemArgs $) {
        this.tagKey = $.tagKey;
        this.tagValue = $.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetTagsItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetTagsItemArgs $;

        public Builder() {
            $ = new DatasetTagsItemArgs();
        }

        public Builder(DatasetTagsItemArgs defaults) {
            $ = new DatasetTagsItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tagKey [Required] The namespaced friendly name of the tag key, e.g. &#34;12345/environment&#34; where 12345 is org id.
         * 
         * @return builder
         * 
         */
        public Builder tagKey(@Nullable Output<String> tagKey) {
            $.tagKey = tagKey;
            return this;
        }

        /**
         * @param tagKey [Required] The namespaced friendly name of the tag key, e.g. &#34;12345/environment&#34; where 12345 is org id.
         * 
         * @return builder
         * 
         */
        public Builder tagKey(String tagKey) {
            return tagKey(Output.of(tagKey));
        }

        /**
         * @param tagValue [Required] Friendly short name of the tag value, e.g. &#34;production&#34;.
         * 
         * @return builder
         * 
         */
        public Builder tagValue(@Nullable Output<String> tagValue) {
            $.tagValue = tagValue;
            return this;
        }

        /**
         * @param tagValue [Required] Friendly short name of the tag value, e.g. &#34;production&#34;.
         * 
         * @return builder
         * 
         */
        public Builder tagValue(String tagValue) {
            return tagValue(Output.of(tagValue));
        }

        public DatasetTagsItemArgs build() {
            return $;
        }
    }

}
