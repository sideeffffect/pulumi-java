// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare_v1.inputs.NotificationConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DicomStoreArgs extends com.pulumi.resources.ResourceArgs {

    public static final DicomStoreArgs Empty = new DicomStoreArgs();

    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    @Import(name="dicomStoreId")
    private @Nullable Output<String> dicomStoreId;

    public Optional<Output<String>> dicomStoreId() {
        return Optional.ofNullable(this.dicomStoreId);
    }

    /**
     * User-supplied key-value pairs used to organize DICOM stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Resource name of the DICOM store, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Notification destination for new DICOM instances. Supplied by the client.
     * 
     */
    @Import(name="notificationConfig")
    private @Nullable Output<NotificationConfigArgs> notificationConfig;

    public Optional<Output<NotificationConfigArgs>> notificationConfig() {
        return Optional.ofNullable(this.notificationConfig);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private DicomStoreArgs() {}

    private DicomStoreArgs(DicomStoreArgs $) {
        this.datasetId = $.datasetId;
        this.dicomStoreId = $.dicomStoreId;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.notificationConfig = $.notificationConfig;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DicomStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DicomStoreArgs $;

        public Builder() {
            $ = new DicomStoreArgs();
        }

        public Builder(DicomStoreArgs defaults) {
            $ = new DicomStoreArgs(Objects.requireNonNull(defaults));
        }

        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        public Builder dicomStoreId(@Nullable Output<String> dicomStoreId) {
            $.dicomStoreId = dicomStoreId;
            return this;
        }

        public Builder dicomStoreId(String dicomStoreId) {
            return dicomStoreId(Output.of(dicomStoreId));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder notificationConfig(@Nullable Output<NotificationConfigArgs> notificationConfig) {
            $.notificationConfig = notificationConfig;
            return this;
        }

        public Builder notificationConfig(NotificationConfigArgs notificationConfig) {
            return notificationConfig(Output.of(notificationConfig));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public DicomStoreArgs build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            return $;
        }
    }

}
