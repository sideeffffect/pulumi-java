// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.metastore_v1beta.inputs.DatabaseDumpArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetadataImportArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetadataImportArgs Empty = new MetadataImportArgs();

    /**
     * Immutable. A database dump from a pre-existing metastore&#39;s database.
     * 
     */
    @Import(name="databaseDump")
    private @Nullable Output<DatabaseDumpArgs> databaseDump;

    public Optional<Output<DatabaseDumpArgs>> databaseDump() {
        return Optional.ofNullable(this.databaseDump);
    }

    /**
     * The description of the metadata import.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="metadataImportId", required=true)
    private Output<String> metadataImportId;

    public Output<String> metadataImportId() {
        return this.metadataImportId;
    }

    /**
     * Immutable. The relative resource name of the metadata import, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}/metadataImports/{metadata_import_id}.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    @Import(name="serviceId", required=true)
    private Output<String> serviceId;

    public Output<String> serviceId() {
        return this.serviceId;
    }

    private MetadataImportArgs() {}

    private MetadataImportArgs(MetadataImportArgs $) {
        this.databaseDump = $.databaseDump;
        this.description = $.description;
        this.location = $.location;
        this.metadataImportId = $.metadataImportId;
        this.name = $.name;
        this.project = $.project;
        this.requestId = $.requestId;
        this.serviceId = $.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetadataImportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetadataImportArgs $;

        public Builder() {
            $ = new MetadataImportArgs();
        }

        public Builder(MetadataImportArgs defaults) {
            $ = new MetadataImportArgs(Objects.requireNonNull(defaults));
        }

        public Builder databaseDump(@Nullable Output<DatabaseDumpArgs> databaseDump) {
            $.databaseDump = databaseDump;
            return this;
        }

        public Builder databaseDump(DatabaseDumpArgs databaseDump) {
            return databaseDump(Output.of(databaseDump));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder metadataImportId(Output<String> metadataImportId) {
            $.metadataImportId = metadataImportId;
            return this;
        }

        public Builder metadataImportId(String metadataImportId) {
            return metadataImportId(Output.of(metadataImportId));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder serviceId(Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        public MetadataImportArgs build() {
            $.metadataImportId = Objects.requireNonNull($.metadataImportId, "expected parameter 'metadataImportId' to be non-null");
            $.serviceId = Objects.requireNonNull($.serviceId, "expected parameter 'serviceId' to be non-null");
            return $;
        }
    }

}
