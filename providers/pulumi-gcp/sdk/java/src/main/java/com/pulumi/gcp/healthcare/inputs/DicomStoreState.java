// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.healthcare.inputs.DicomStoreNotificationConfigArgs;
import com.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DicomStoreState extends ResourceArgs {

    public static final DicomStoreState Empty = new DicomStoreState();

    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
     * 
     */
    @Import(name="dataset")
    private @Nullable Output<String> dataset;

    /**
     * @return Identifies the dataset addressed by this request. Must be in the format
     * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
     * 
     */
    public Optional<Output<String>> dataset() {
        return Optional.ofNullable(this.dataset);
    }

    /**
     * User-supplied key-value pairs used to organize DICOM stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of &#34;key&#34;: value pairs.
     * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-supplied key-value pairs used to organize DICOM stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of &#34;key&#34;: value pairs.
     * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The resource name for the DicomStore.
     * ** Changing this property may recreate the Dicom store (removing all data) **
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name for the DicomStore.
     * ** Changing this property may recreate the Dicom store (removing all data) **
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Import(name="notificationConfig")
    private @Nullable Output<DicomStoreNotificationConfigArgs> notificationConfig;

    /**
     * @return A nested object resource
     * Structure is documented below.
     * 
     */
    public Optional<Output<DicomStoreNotificationConfigArgs>> notificationConfig() {
        return Optional.ofNullable(this.notificationConfig);
    }

    /**
     * The fully qualified name of this dataset
     * 
     */
    @Import(name="selfLink")
    private @Nullable Output<String> selfLink;

    /**
     * @return The fully qualified name of this dataset
     * 
     */
    public Optional<Output<String>> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    /**
     * To enable streaming to BigQuery, configure the streamConfigs object in your DICOM store.
     * streamConfigs is an array, so you can specify multiple BigQuery destinations. You can stream metadata from a single DICOM store to up to five BigQuery tables in a BigQuery dataset.
     * Structure is documented below.
     * 
     */
    @Import(name="streamConfigs")
    private @Nullable Output<List<DicomStoreStreamConfigArgs>> streamConfigs;

    /**
     * @return To enable streaming to BigQuery, configure the streamConfigs object in your DICOM store.
     * streamConfigs is an array, so you can specify multiple BigQuery destinations. You can stream metadata from a single DICOM store to up to five BigQuery tables in a BigQuery dataset.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<DicomStoreStreamConfigArgs>>> streamConfigs() {
        return Optional.ofNullable(this.streamConfigs);
    }

    private DicomStoreState() {}

    private DicomStoreState(DicomStoreState $) {
        this.dataset = $.dataset;
        this.labels = $.labels;
        this.name = $.name;
        this.notificationConfig = $.notificationConfig;
        this.selfLink = $.selfLink;
        this.streamConfigs = $.streamConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DicomStoreState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DicomStoreState $;

        public Builder() {
            $ = new DicomStoreState();
        }

        public Builder(DicomStoreState defaults) {
            $ = new DicomStoreState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataset Identifies the dataset addressed by this request. Must be in the format
         * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
         * 
         * @return builder
         * 
         */
        public Builder dataset(@Nullable Output<String> dataset) {
            $.dataset = dataset;
            return this;
        }

        /**
         * @param dataset Identifies the dataset addressed by this request. Must be in the format
         * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
         * 
         * @return builder
         * 
         */
        public Builder dataset(String dataset) {
            return dataset(Output.of(dataset));
        }

        /**
         * @param labels User-supplied key-value pairs used to organize DICOM stores.
         * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
         * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
         * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
         * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
         * No more than 64 labels can be associated with a given store.
         * An object containing a list of &#34;key&#34;: value pairs.
         * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-supplied key-value pairs used to organize DICOM stores.
         * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
         * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
         * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
         * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
         * No more than 64 labels can be associated with a given store.
         * An object containing a list of &#34;key&#34;: value pairs.
         * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The resource name for the DicomStore.
         * ** Changing this property may recreate the Dicom store (removing all data) **
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name for the DicomStore.
         * ** Changing this property may recreate the Dicom store (removing all data) **
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notificationConfig A nested object resource
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfig(@Nullable Output<DicomStoreNotificationConfigArgs> notificationConfig) {
            $.notificationConfig = notificationConfig;
            return this;
        }

        /**
         * @param notificationConfig A nested object resource
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfig(DicomStoreNotificationConfigArgs notificationConfig) {
            return notificationConfig(Output.of(notificationConfig));
        }

        /**
         * @param selfLink The fully qualified name of this dataset
         * 
         * @return builder
         * 
         */
        public Builder selfLink(@Nullable Output<String> selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        /**
         * @param selfLink The fully qualified name of this dataset
         * 
         * @return builder
         * 
         */
        public Builder selfLink(String selfLink) {
            return selfLink(Output.of(selfLink));
        }

        /**
         * @param streamConfigs To enable streaming to BigQuery, configure the streamConfigs object in your DICOM store.
         * streamConfigs is an array, so you can specify multiple BigQuery destinations. You can stream metadata from a single DICOM store to up to five BigQuery tables in a BigQuery dataset.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder streamConfigs(@Nullable Output<List<DicomStoreStreamConfigArgs>> streamConfigs) {
            $.streamConfigs = streamConfigs;
            return this;
        }

        /**
         * @param streamConfigs To enable streaming to BigQuery, configure the streamConfigs object in your DICOM store.
         * streamConfigs is an array, so you can specify multiple BigQuery destinations. You can stream metadata from a single DICOM store to up to five BigQuery tables in a BigQuery dataset.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder streamConfigs(List<DicomStoreStreamConfigArgs> streamConfigs) {
            return streamConfigs(Output.of(streamConfigs));
        }

        /**
         * @param streamConfigs To enable streaming to BigQuery, configure the streamConfigs object in your DICOM store.
         * streamConfigs is an array, so you can specify multiple BigQuery destinations. You can stream metadata from a single DICOM store to up to five BigQuery tables in a BigQuery dataset.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder streamConfigs(DicomStoreStreamConfigArgs... streamConfigs) {
            return streamConfigs(List.of(streamConfigs));
        }

        public DicomStoreState build() {
            return $;
        }
    }

}
