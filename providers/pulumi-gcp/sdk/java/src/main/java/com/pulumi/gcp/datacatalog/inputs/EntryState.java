// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.datacatalog.inputs.EntryBigqueryDateShardedSpecArgs;
import com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecArgs;
import com.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EntryState extends ResourceArgs {

    public static final EntryState Empty = new EntryState();

    /**
     * Specification for a group of BigQuery tables with name pattern [prefix]YYYYMMDD. Context:
     * https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
     * 
     */
    @Import(name="bigqueryDateShardedSpecs")
    private @Nullable Output<List<EntryBigqueryDateShardedSpecArgs>> bigqueryDateShardedSpecs;

    /**
     * @return Specification for a group of BigQuery tables with name pattern [prefix]YYYYMMDD. Context:
     * https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
     * 
     */
    public Optional<Output<List<EntryBigqueryDateShardedSpecArgs>>> bigqueryDateShardedSpecs() {
        return Optional.ofNullable(this.bigqueryDateShardedSpecs);
    }

    /**
     * Specification that applies to a BigQuery table. This is only valid on entries of type TABLE.
     * 
     */
    @Import(name="bigqueryTableSpecs")
    private @Nullable Output<List<EntryBigqueryTableSpecArgs>> bigqueryTableSpecs;

    /**
     * @return Specification that applies to a BigQuery table. This is only valid on entries of type TABLE.
     * 
     */
    public Optional<Output<List<EntryBigqueryTableSpecArgs>>> bigqueryTableSpecs() {
        return Optional.ofNullable(this.bigqueryTableSpecs);
    }

    /**
     * Entry description, which can consist of several sentences or paragraphs that describe entry contents.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Entry description, which can consist of several sentences or paragraphs that describe entry contents.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Display information such as title and description. A short name to identify the entry,
     * for example, &#34;Analytics Data - Jan 2011&#34;.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Display information such as title and description. A short name to identify the entry,
     * for example, &#34;Analytics Data - Jan 2011&#34;.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The name of the entry group this entry is in.
     * 
     */
    @Import(name="entryGroup")
    private @Nullable Output<String> entryGroup;

    /**
     * @return The name of the entry group this entry is in.
     * 
     */
    public Optional<Output<String>> entryGroup() {
        return Optional.ofNullable(this.entryGroup);
    }

    /**
     * The id of the entry to create.
     * 
     */
    @Import(name="entryId")
    private @Nullable Output<String> entryId;

    /**
     * @return The id of the entry to create.
     * 
     */
    public Optional<Output<String>> entryId() {
        return Optional.ofNullable(this.entryId);
    }

    /**
     * Specification that applies to a Cloud Storage fileset. This is only valid on entries of type FILESET.
     * Structure is documented below.
     * 
     */
    @Import(name="gcsFilesetSpec")
    private @Nullable Output<EntryGcsFilesetSpecArgs> gcsFilesetSpec;

    /**
     * @return Specification that applies to a Cloud Storage fileset. This is only valid on entries of type FILESET.
     * Structure is documented below.
     * 
     */
    public Optional<Output<EntryGcsFilesetSpecArgs>> gcsFilesetSpec() {
        return Optional.ofNullable(this.gcsFilesetSpec);
    }

    /**
     * This field indicates the entry&#39;s source system that Data Catalog integrates with, such as BigQuery or Pub/Sub.
     * 
     */
    @Import(name="integratedSystem")
    private @Nullable Output<String> integratedSystem;

    /**
     * @return This field indicates the entry&#39;s source system that Data Catalog integrates with, such as BigQuery or Pub/Sub.
     * 
     */
    public Optional<Output<String>> integratedSystem() {
        return Optional.ofNullable(this.integratedSystem);
    }

    /**
     * The resource this metadata entry refers to.
     * For Google Cloud Platform resources, linkedResource is the full name of the resource.
     * For example, the linkedResource for a table resource from BigQuery is:
     * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
     * Output only when Entry is of type in the EntryType enum. For entries with userSpecifiedType,
     * this field is optional and defaults to an empty string.
     * 
     */
    @Import(name="linkedResource")
    private @Nullable Output<String> linkedResource;

    /**
     * @return The resource this metadata entry refers to.
     * For Google Cloud Platform resources, linkedResource is the full name of the resource.
     * For example, the linkedResource for a table resource from BigQuery is:
     * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
     * Output only when Entry is of type in the EntryType enum. For entries with userSpecifiedType,
     * this field is optional and defaults to an empty string.
     * 
     */
    public Optional<Output<String>> linkedResource() {
        return Optional.ofNullable(this.linkedResource);
    }

    /**
     * The Data Catalog resource name of the entry in URL format. Example:
     * projects/{project_id}/locations/{location}/entryGroups/{entryGroupId}/entries/{entryId}. Note that this Entry and its
     * child resources may not actually be stored in the location in this name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Data Catalog resource name of the entry in URL format. Example:
     * projects/{project_id}/locations/{location}/entryGroups/{entryGroupId}/entries/{entryId}. Note that this Entry and its
     * child resources may not actually be stored in the location in this name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Schema of the entry (e.g. BigQuery, GoogleSQL, Avro schema), as a json string. An entry might not have any schema
     * attached to it. See
     * https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.entryGroups.entries#schema
     * for what fields this schema can contain.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return Schema of the entry (e.g. BigQuery, GoogleSQL, Avro schema), as a json string. An entry might not have any schema
     * attached to it. See
     * https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.entryGroups.entries#schema
     * for what fields this schema can contain.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * The type of the entry. Only used for Entries with types in the EntryType enum.
     * Currently, only FILESET enum value is allowed. All other entries created through Data Catalog must use userSpecifiedType.
     * Possible values are `FILESET`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the entry. Only used for Entries with types in the EntryType enum.
     * Currently, only FILESET enum value is allowed. All other entries created through Data Catalog must use userSpecifiedType.
     * Possible values are `FILESET`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * This field indicates the entry&#39;s source system that Data Catalog does not integrate with.
     * userSpecifiedSystem strings must begin with a letter or underscore and can only contain letters, numbers,
     * and underscores; are case insensitive; must be at least 1 character and at most 64 characters long.
     * 
     */
    @Import(name="userSpecifiedSystem")
    private @Nullable Output<String> userSpecifiedSystem;

    /**
     * @return This field indicates the entry&#39;s source system that Data Catalog does not integrate with.
     * userSpecifiedSystem strings must begin with a letter or underscore and can only contain letters, numbers,
     * and underscores; are case insensitive; must be at least 1 character and at most 64 characters long.
     * 
     */
    public Optional<Output<String>> userSpecifiedSystem() {
        return Optional.ofNullable(this.userSpecifiedSystem);
    }

    /**
     * Entry type if it does not fit any of the input-allowed values listed in EntryType enum above.
     * When creating an entry, users should check the enum values first, if nothing matches the entry
     * to be created, then provide a custom value, for example &#34;my_special_type&#34;.
     * userSpecifiedType strings must begin with a letter or underscore and can only contain letters,
     * numbers, and underscores; are case insensitive; must be at least 1 character and at most 64 characters long.
     * 
     */
    @Import(name="userSpecifiedType")
    private @Nullable Output<String> userSpecifiedType;

    /**
     * @return Entry type if it does not fit any of the input-allowed values listed in EntryType enum above.
     * When creating an entry, users should check the enum values first, if nothing matches the entry
     * to be created, then provide a custom value, for example &#34;my_special_type&#34;.
     * userSpecifiedType strings must begin with a letter or underscore and can only contain letters,
     * numbers, and underscores; are case insensitive; must be at least 1 character and at most 64 characters long.
     * 
     */
    public Optional<Output<String>> userSpecifiedType() {
        return Optional.ofNullable(this.userSpecifiedType);
    }

    private EntryState() {}

    private EntryState(EntryState $) {
        this.bigqueryDateShardedSpecs = $.bigqueryDateShardedSpecs;
        this.bigqueryTableSpecs = $.bigqueryTableSpecs;
        this.description = $.description;
        this.displayName = $.displayName;
        this.entryGroup = $.entryGroup;
        this.entryId = $.entryId;
        this.gcsFilesetSpec = $.gcsFilesetSpec;
        this.integratedSystem = $.integratedSystem;
        this.linkedResource = $.linkedResource;
        this.name = $.name;
        this.schema = $.schema;
        this.type = $.type;
        this.userSpecifiedSystem = $.userSpecifiedSystem;
        this.userSpecifiedType = $.userSpecifiedType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntryState $;

        public Builder() {
            $ = new EntryState();
        }

        public Builder(EntryState defaults) {
            $ = new EntryState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bigqueryDateShardedSpecs Specification for a group of BigQuery tables with name pattern [prefix]YYYYMMDD. Context:
         * https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
         * 
         * @return builder
         * 
         */
        public Builder bigqueryDateShardedSpecs(@Nullable Output<List<EntryBigqueryDateShardedSpecArgs>> bigqueryDateShardedSpecs) {
            $.bigqueryDateShardedSpecs = bigqueryDateShardedSpecs;
            return this;
        }

        /**
         * @param bigqueryDateShardedSpecs Specification for a group of BigQuery tables with name pattern [prefix]YYYYMMDD. Context:
         * https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
         * 
         * @return builder
         * 
         */
        public Builder bigqueryDateShardedSpecs(List<EntryBigqueryDateShardedSpecArgs> bigqueryDateShardedSpecs) {
            return bigqueryDateShardedSpecs(Output.of(bigqueryDateShardedSpecs));
        }

        /**
         * @param bigqueryDateShardedSpecs Specification for a group of BigQuery tables with name pattern [prefix]YYYYMMDD. Context:
         * https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
         * 
         * @return builder
         * 
         */
        public Builder bigqueryDateShardedSpecs(EntryBigqueryDateShardedSpecArgs... bigqueryDateShardedSpecs) {
            return bigqueryDateShardedSpecs(List.of(bigqueryDateShardedSpecs));
        }

        /**
         * @param bigqueryTableSpecs Specification that applies to a BigQuery table. This is only valid on entries of type TABLE.
         * 
         * @return builder
         * 
         */
        public Builder bigqueryTableSpecs(@Nullable Output<List<EntryBigqueryTableSpecArgs>> bigqueryTableSpecs) {
            $.bigqueryTableSpecs = bigqueryTableSpecs;
            return this;
        }

        /**
         * @param bigqueryTableSpecs Specification that applies to a BigQuery table. This is only valid on entries of type TABLE.
         * 
         * @return builder
         * 
         */
        public Builder bigqueryTableSpecs(List<EntryBigqueryTableSpecArgs> bigqueryTableSpecs) {
            return bigqueryTableSpecs(Output.of(bigqueryTableSpecs));
        }

        /**
         * @param bigqueryTableSpecs Specification that applies to a BigQuery table. This is only valid on entries of type TABLE.
         * 
         * @return builder
         * 
         */
        public Builder bigqueryTableSpecs(EntryBigqueryTableSpecArgs... bigqueryTableSpecs) {
            return bigqueryTableSpecs(List.of(bigqueryTableSpecs));
        }

        /**
         * @param description Entry description, which can consist of several sentences or paragraphs that describe entry contents.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Entry description, which can consist of several sentences or paragraphs that describe entry contents.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName Display information such as title and description. A short name to identify the entry,
         * for example, &#34;Analytics Data - Jan 2011&#34;.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Display information such as title and description. A short name to identify the entry,
         * for example, &#34;Analytics Data - Jan 2011&#34;.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param entryGroup The name of the entry group this entry is in.
         * 
         * @return builder
         * 
         */
        public Builder entryGroup(@Nullable Output<String> entryGroup) {
            $.entryGroup = entryGroup;
            return this;
        }

        /**
         * @param entryGroup The name of the entry group this entry is in.
         * 
         * @return builder
         * 
         */
        public Builder entryGroup(String entryGroup) {
            return entryGroup(Output.of(entryGroup));
        }

        /**
         * @param entryId The id of the entry to create.
         * 
         * @return builder
         * 
         */
        public Builder entryId(@Nullable Output<String> entryId) {
            $.entryId = entryId;
            return this;
        }

        /**
         * @param entryId The id of the entry to create.
         * 
         * @return builder
         * 
         */
        public Builder entryId(String entryId) {
            return entryId(Output.of(entryId));
        }

        /**
         * @param gcsFilesetSpec Specification that applies to a Cloud Storage fileset. This is only valid on entries of type FILESET.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gcsFilesetSpec(@Nullable Output<EntryGcsFilesetSpecArgs> gcsFilesetSpec) {
            $.gcsFilesetSpec = gcsFilesetSpec;
            return this;
        }

        /**
         * @param gcsFilesetSpec Specification that applies to a Cloud Storage fileset. This is only valid on entries of type FILESET.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gcsFilesetSpec(EntryGcsFilesetSpecArgs gcsFilesetSpec) {
            return gcsFilesetSpec(Output.of(gcsFilesetSpec));
        }

        /**
         * @param integratedSystem This field indicates the entry&#39;s source system that Data Catalog integrates with, such as BigQuery or Pub/Sub.
         * 
         * @return builder
         * 
         */
        public Builder integratedSystem(@Nullable Output<String> integratedSystem) {
            $.integratedSystem = integratedSystem;
            return this;
        }

        /**
         * @param integratedSystem This field indicates the entry&#39;s source system that Data Catalog integrates with, such as BigQuery or Pub/Sub.
         * 
         * @return builder
         * 
         */
        public Builder integratedSystem(String integratedSystem) {
            return integratedSystem(Output.of(integratedSystem));
        }

        /**
         * @param linkedResource The resource this metadata entry refers to.
         * For Google Cloud Platform resources, linkedResource is the full name of the resource.
         * For example, the linkedResource for a table resource from BigQuery is:
         * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
         * Output only when Entry is of type in the EntryType enum. For entries with userSpecifiedType,
         * this field is optional and defaults to an empty string.
         * 
         * @return builder
         * 
         */
        public Builder linkedResource(@Nullable Output<String> linkedResource) {
            $.linkedResource = linkedResource;
            return this;
        }

        /**
         * @param linkedResource The resource this metadata entry refers to.
         * For Google Cloud Platform resources, linkedResource is the full name of the resource.
         * For example, the linkedResource for a table resource from BigQuery is:
         * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
         * Output only when Entry is of type in the EntryType enum. For entries with userSpecifiedType,
         * this field is optional and defaults to an empty string.
         * 
         * @return builder
         * 
         */
        public Builder linkedResource(String linkedResource) {
            return linkedResource(Output.of(linkedResource));
        }

        /**
         * @param name The Data Catalog resource name of the entry in URL format. Example:
         * projects/{project_id}/locations/{location}/entryGroups/{entryGroupId}/entries/{entryId}. Note that this Entry and its
         * child resources may not actually be stored in the location in this name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Data Catalog resource name of the entry in URL format. Example:
         * projects/{project_id}/locations/{location}/entryGroups/{entryGroupId}/entries/{entryId}. Note that this Entry and its
         * child resources may not actually be stored in the location in this name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schema Schema of the entry (e.g. BigQuery, GoogleSQL, Avro schema), as a json string. An entry might not have any schema
         * attached to it. See
         * https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.entryGroups.entries#schema
         * for what fields this schema can contain.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema Schema of the entry (e.g. BigQuery, GoogleSQL, Avro schema), as a json string. An entry might not have any schema
         * attached to it. See
         * https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.entryGroups.entries#schema
         * for what fields this schema can contain.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param type The type of the entry. Only used for Entries with types in the EntryType enum.
         * Currently, only FILESET enum value is allowed. All other entries created through Data Catalog must use userSpecifiedType.
         * Possible values are `FILESET`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the entry. Only used for Entries with types in the EntryType enum.
         * Currently, only FILESET enum value is allowed. All other entries created through Data Catalog must use userSpecifiedType.
         * Possible values are `FILESET`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param userSpecifiedSystem This field indicates the entry&#39;s source system that Data Catalog does not integrate with.
         * userSpecifiedSystem strings must begin with a letter or underscore and can only contain letters, numbers,
         * and underscores; are case insensitive; must be at least 1 character and at most 64 characters long.
         * 
         * @return builder
         * 
         */
        public Builder userSpecifiedSystem(@Nullable Output<String> userSpecifiedSystem) {
            $.userSpecifiedSystem = userSpecifiedSystem;
            return this;
        }

        /**
         * @param userSpecifiedSystem This field indicates the entry&#39;s source system that Data Catalog does not integrate with.
         * userSpecifiedSystem strings must begin with a letter or underscore and can only contain letters, numbers,
         * and underscores; are case insensitive; must be at least 1 character and at most 64 characters long.
         * 
         * @return builder
         * 
         */
        public Builder userSpecifiedSystem(String userSpecifiedSystem) {
            return userSpecifiedSystem(Output.of(userSpecifiedSystem));
        }

        /**
         * @param userSpecifiedType Entry type if it does not fit any of the input-allowed values listed in EntryType enum above.
         * When creating an entry, users should check the enum values first, if nothing matches the entry
         * to be created, then provide a custom value, for example &#34;my_special_type&#34;.
         * userSpecifiedType strings must begin with a letter or underscore and can only contain letters,
         * numbers, and underscores; are case insensitive; must be at least 1 character and at most 64 characters long.
         * 
         * @return builder
         * 
         */
        public Builder userSpecifiedType(@Nullable Output<String> userSpecifiedType) {
            $.userSpecifiedType = userSpecifiedType;
            return this;
        }

        /**
         * @param userSpecifiedType Entry type if it does not fit any of the input-allowed values listed in EntryType enum above.
         * When creating an entry, users should check the enum values first, if nothing matches the entry
         * to be created, then provide a custom value, for example &#34;my_special_type&#34;.
         * userSpecifiedType strings must begin with a letter or underscore and can only contain letters,
         * numbers, and underscores; are case insensitive; must be at least 1 character and at most 64 characters long.
         * 
         * @return builder
         * 
         */
        public Builder userSpecifiedType(String userSpecifiedType) {
            return userSpecifiedType(Output.of(userSpecifiedType));
        }

        public EntryState build() {
            return $;
        }
    }

}
