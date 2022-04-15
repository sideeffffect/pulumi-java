// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.datacatalog.inputs.EntryBigqueryDateShardedSpecGetArgs;
import io.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecGetArgs;
import io.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntryState extends io.pulumi.resources.ResourceArgs {

    public static final EntryState Empty = new EntryState();

    /**
     * Specification for a group of BigQuery tables with name pattern [prefix]YYYYMMDD. Context:
     * https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
     * 
     */
    @Import(name="bigqueryDateShardedSpecs")
      private final @Nullable Output<List<EntryBigqueryDateShardedSpecGetArgs>> bigqueryDateShardedSpecs;

    public Output<List<EntryBigqueryDateShardedSpecGetArgs>> bigqueryDateShardedSpecs() {
        return this.bigqueryDateShardedSpecs == null ? Codegen.empty() : this.bigqueryDateShardedSpecs;
    }

    /**
     * Specification that applies to a BigQuery table. This is only valid on entries of type TABLE.
     * 
     */
    @Import(name="bigqueryTableSpecs")
      private final @Nullable Output<List<EntryBigqueryTableSpecGetArgs>> bigqueryTableSpecs;

    public Output<List<EntryBigqueryTableSpecGetArgs>> bigqueryTableSpecs() {
        return this.bigqueryTableSpecs == null ? Codegen.empty() : this.bigqueryTableSpecs;
    }

    /**
     * Entry description, which can consist of several sentences or paragraphs that describe entry contents.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Display information such as title and description. A short name to identify the entry,
     * for example, "Analytics Data - Jan 2011".
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The name of the entry group this entry is in.
     * 
     */
    @Import(name="entryGroup")
      private final @Nullable Output<String> entryGroup;

    public Output<String> entryGroup() {
        return this.entryGroup == null ? Codegen.empty() : this.entryGroup;
    }

    /**
     * The id of the entry to create.
     * 
     */
    @Import(name="entryId")
      private final @Nullable Output<String> entryId;

    public Output<String> entryId() {
        return this.entryId == null ? Codegen.empty() : this.entryId;
    }

    /**
     * Specification that applies to a Cloud Storage fileset. This is only valid on entries of type FILESET.
     * Structure is documented below.
     * 
     */
    @Import(name="gcsFilesetSpec")
      private final @Nullable Output<EntryGcsFilesetSpecGetArgs> gcsFilesetSpec;

    public Output<EntryGcsFilesetSpecGetArgs> gcsFilesetSpec() {
        return this.gcsFilesetSpec == null ? Codegen.empty() : this.gcsFilesetSpec;
    }

    /**
     * This field indicates the entry's source system that Data Catalog integrates with, such as BigQuery or Pub/Sub.
     * 
     */
    @Import(name="integratedSystem")
      private final @Nullable Output<String> integratedSystem;

    public Output<String> integratedSystem() {
        return this.integratedSystem == null ? Codegen.empty() : this.integratedSystem;
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
      private final @Nullable Output<String> linkedResource;

    public Output<String> linkedResource() {
        return this.linkedResource == null ? Codegen.empty() : this.linkedResource;
    }

    /**
     * The Data Catalog resource name of the entry in URL format. Example:
     * projects/{project_id}/locations/{location}/entryGroups/{entryGroupId}/entries/{entryId}. Note that this Entry and its
     * child resources may not actually be stored in the location in this name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Schema of the entry (e.g. BigQuery, GoogleSQL, Avro schema), as a json string. An entry might not have any schema
     * attached to it. See
     * https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.entryGroups.entries#schema
     * for what fields this schema can contain.
     * 
     */
    @Import(name="schema")
      private final @Nullable Output<String> schema;

    public Output<String> schema() {
        return this.schema == null ? Codegen.empty() : this.schema;
    }

    /**
     * The type of the entry. Only used for Entries with types in the EntryType enum.
     * Currently, only FILESET enum value is allowed. All other entries created through Data Catalog must use userSpecifiedType.
     * Possible values are `FILESET`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * This field indicates the entry's source system that Data Catalog does not integrate with.
     * userSpecifiedSystem strings must begin with a letter or underscore and can only contain letters, numbers,
     * and underscores; are case insensitive; must be at least 1 character and at most 64 characters long.
     * 
     */
    @Import(name="userSpecifiedSystem")
      private final @Nullable Output<String> userSpecifiedSystem;

    public Output<String> userSpecifiedSystem() {
        return this.userSpecifiedSystem == null ? Codegen.empty() : this.userSpecifiedSystem;
    }

    /**
     * Entry type if it does not fit any of the input-allowed values listed in EntryType enum above.
     * When creating an entry, users should check the enum values first, if nothing matches the entry
     * to be created, then provide a custom value, for example "my_special_type".
     * userSpecifiedType strings must begin with a letter or underscore and can only contain letters,
     * numbers, and underscores; are case insensitive; must be at least 1 character and at most 64 characters long.
     * 
     */
    @Import(name="userSpecifiedType")
      private final @Nullable Output<String> userSpecifiedType;

    public Output<String> userSpecifiedType() {
        return this.userSpecifiedType == null ? Codegen.empty() : this.userSpecifiedType;
    }

    public EntryState(
        @Nullable Output<List<EntryBigqueryDateShardedSpecGetArgs>> bigqueryDateShardedSpecs,
        @Nullable Output<List<EntryBigqueryTableSpecGetArgs>> bigqueryTableSpecs,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<String> entryGroup,
        @Nullable Output<String> entryId,
        @Nullable Output<EntryGcsFilesetSpecGetArgs> gcsFilesetSpec,
        @Nullable Output<String> integratedSystem,
        @Nullable Output<String> linkedResource,
        @Nullable Output<String> name,
        @Nullable Output<String> schema,
        @Nullable Output<String> type,
        @Nullable Output<String> userSpecifiedSystem,
        @Nullable Output<String> userSpecifiedType) {
        this.bigqueryDateShardedSpecs = bigqueryDateShardedSpecs;
        this.bigqueryTableSpecs = bigqueryTableSpecs;
        this.description = description;
        this.displayName = displayName;
        this.entryGroup = entryGroup;
        this.entryId = entryId;
        this.gcsFilesetSpec = gcsFilesetSpec;
        this.integratedSystem = integratedSystem;
        this.linkedResource = linkedResource;
        this.name = name;
        this.schema = schema;
        this.type = type;
        this.userSpecifiedSystem = userSpecifiedSystem;
        this.userSpecifiedType = userSpecifiedType;
    }

    private EntryState() {
        this.bigqueryDateShardedSpecs = Codegen.empty();
        this.bigqueryTableSpecs = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.entryGroup = Codegen.empty();
        this.entryId = Codegen.empty();
        this.gcsFilesetSpec = Codegen.empty();
        this.integratedSystem = Codegen.empty();
        this.linkedResource = Codegen.empty();
        this.name = Codegen.empty();
        this.schema = Codegen.empty();
        this.type = Codegen.empty();
        this.userSpecifiedSystem = Codegen.empty();
        this.userSpecifiedType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<EntryBigqueryDateShardedSpecGetArgs>> bigqueryDateShardedSpecs;
        private @Nullable Output<List<EntryBigqueryTableSpecGetArgs>> bigqueryTableSpecs;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> entryGroup;
        private @Nullable Output<String> entryId;
        private @Nullable Output<EntryGcsFilesetSpecGetArgs> gcsFilesetSpec;
        private @Nullable Output<String> integratedSystem;
        private @Nullable Output<String> linkedResource;
        private @Nullable Output<String> name;
        private @Nullable Output<String> schema;
        private @Nullable Output<String> type;
        private @Nullable Output<String> userSpecifiedSystem;
        private @Nullable Output<String> userSpecifiedType;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryDateShardedSpecs = defaults.bigqueryDateShardedSpecs;
    	      this.bigqueryTableSpecs = defaults.bigqueryTableSpecs;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.entryGroup = defaults.entryGroup;
    	      this.entryId = defaults.entryId;
    	      this.gcsFilesetSpec = defaults.gcsFilesetSpec;
    	      this.integratedSystem = defaults.integratedSystem;
    	      this.linkedResource = defaults.linkedResource;
    	      this.name = defaults.name;
    	      this.schema = defaults.schema;
    	      this.type = defaults.type;
    	      this.userSpecifiedSystem = defaults.userSpecifiedSystem;
    	      this.userSpecifiedType = defaults.userSpecifiedType;
        }

        public Builder bigqueryDateShardedSpecs(@Nullable Output<List<EntryBigqueryDateShardedSpecGetArgs>> bigqueryDateShardedSpecs) {
            this.bigqueryDateShardedSpecs = bigqueryDateShardedSpecs;
            return this;
        }
        public Builder bigqueryDateShardedSpecs(@Nullable List<EntryBigqueryDateShardedSpecGetArgs> bigqueryDateShardedSpecs) {
            this.bigqueryDateShardedSpecs = Codegen.ofNullable(bigqueryDateShardedSpecs);
            return this;
        }
        public Builder bigqueryDateShardedSpecs(EntryBigqueryDateShardedSpecGetArgs... bigqueryDateShardedSpecs) {
            return bigqueryDateShardedSpecs(List.of(bigqueryDateShardedSpecs));
        }
        public Builder bigqueryTableSpecs(@Nullable Output<List<EntryBigqueryTableSpecGetArgs>> bigqueryTableSpecs) {
            this.bigqueryTableSpecs = bigqueryTableSpecs;
            return this;
        }
        public Builder bigqueryTableSpecs(@Nullable List<EntryBigqueryTableSpecGetArgs> bigqueryTableSpecs) {
            this.bigqueryTableSpecs = Codegen.ofNullable(bigqueryTableSpecs);
            return this;
        }
        public Builder bigqueryTableSpecs(EntryBigqueryTableSpecGetArgs... bigqueryTableSpecs) {
            return bigqueryTableSpecs(List.of(bigqueryTableSpecs));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder entryGroup(@Nullable Output<String> entryGroup) {
            this.entryGroup = entryGroup;
            return this;
        }
        public Builder entryGroup(@Nullable String entryGroup) {
            this.entryGroup = Codegen.ofNullable(entryGroup);
            return this;
        }
        public Builder entryId(@Nullable Output<String> entryId) {
            this.entryId = entryId;
            return this;
        }
        public Builder entryId(@Nullable String entryId) {
            this.entryId = Codegen.ofNullable(entryId);
            return this;
        }
        public Builder gcsFilesetSpec(@Nullable Output<EntryGcsFilesetSpecGetArgs> gcsFilesetSpec) {
            this.gcsFilesetSpec = gcsFilesetSpec;
            return this;
        }
        public Builder gcsFilesetSpec(@Nullable EntryGcsFilesetSpecGetArgs gcsFilesetSpec) {
            this.gcsFilesetSpec = Codegen.ofNullable(gcsFilesetSpec);
            return this;
        }
        public Builder integratedSystem(@Nullable Output<String> integratedSystem) {
            this.integratedSystem = integratedSystem;
            return this;
        }
        public Builder integratedSystem(@Nullable String integratedSystem) {
            this.integratedSystem = Codegen.ofNullable(integratedSystem);
            return this;
        }
        public Builder linkedResource(@Nullable Output<String> linkedResource) {
            this.linkedResource = linkedResource;
            return this;
        }
        public Builder linkedResource(@Nullable String linkedResource) {
            this.linkedResource = Codegen.ofNullable(linkedResource);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder schema(@Nullable Output<String> schema) {
            this.schema = schema;
            return this;
        }
        public Builder schema(@Nullable String schema) {
            this.schema = Codegen.ofNullable(schema);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder userSpecifiedSystem(@Nullable Output<String> userSpecifiedSystem) {
            this.userSpecifiedSystem = userSpecifiedSystem;
            return this;
        }
        public Builder userSpecifiedSystem(@Nullable String userSpecifiedSystem) {
            this.userSpecifiedSystem = Codegen.ofNullable(userSpecifiedSystem);
            return this;
        }
        public Builder userSpecifiedType(@Nullable Output<String> userSpecifiedType) {
            this.userSpecifiedType = userSpecifiedType;
            return this;
        }
        public Builder userSpecifiedType(@Nullable String userSpecifiedType) {
            this.userSpecifiedType = Codegen.ofNullable(userSpecifiedType);
            return this;
        }        public EntryState build() {
            return new EntryState(bigqueryDateShardedSpecs, bigqueryTableSpecs, description, displayName, entryGroup, entryId, gcsFilesetSpec, integratedSystem, linkedResource, name, schema, type, userSpecifiedSystem, userSpecifiedType);
        }
    }
}
