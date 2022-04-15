// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntryArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntryArgs Empty = new EntryArgs();

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
    @Import(name="entryGroup", required=true)
      private final Output<String> entryGroup;

    public Output<String> entryGroup() {
        return this.entryGroup;
    }

    /**
     * The id of the entry to create.
     * 
     */
    @Import(name="entryId", required=true)
      private final Output<String> entryId;

    public Output<String> entryId() {
        return this.entryId;
    }

    /**
     * Specification that applies to a Cloud Storage fileset. This is only valid on entries of type FILESET.
     * Structure is documented below.
     * 
     */
    @Import(name="gcsFilesetSpec")
      private final @Nullable Output<EntryGcsFilesetSpecArgs> gcsFilesetSpec;

    public Output<EntryGcsFilesetSpecArgs> gcsFilesetSpec() {
        return this.gcsFilesetSpec == null ? Codegen.empty() : this.gcsFilesetSpec;
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

    public EntryArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        Output<String> entryGroup,
        Output<String> entryId,
        @Nullable Output<EntryGcsFilesetSpecArgs> gcsFilesetSpec,
        @Nullable Output<String> linkedResource,
        @Nullable Output<String> schema,
        @Nullable Output<String> type,
        @Nullable Output<String> userSpecifiedSystem,
        @Nullable Output<String> userSpecifiedType) {
        this.description = description;
        this.displayName = displayName;
        this.entryGroup = Objects.requireNonNull(entryGroup, "expected parameter 'entryGroup' to be non-null");
        this.entryId = Objects.requireNonNull(entryId, "expected parameter 'entryId' to be non-null");
        this.gcsFilesetSpec = gcsFilesetSpec;
        this.linkedResource = linkedResource;
        this.schema = schema;
        this.type = type;
        this.userSpecifiedSystem = userSpecifiedSystem;
        this.userSpecifiedType = userSpecifiedType;
    }

    private EntryArgs() {
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.entryGroup = Codegen.empty();
        this.entryId = Codegen.empty();
        this.gcsFilesetSpec = Codegen.empty();
        this.linkedResource = Codegen.empty();
        this.schema = Codegen.empty();
        this.type = Codegen.empty();
        this.userSpecifiedSystem = Codegen.empty();
        this.userSpecifiedType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private Output<String> entryGroup;
        private Output<String> entryId;
        private @Nullable Output<EntryGcsFilesetSpecArgs> gcsFilesetSpec;
        private @Nullable Output<String> linkedResource;
        private @Nullable Output<String> schema;
        private @Nullable Output<String> type;
        private @Nullable Output<String> userSpecifiedSystem;
        private @Nullable Output<String> userSpecifiedType;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.entryGroup = defaults.entryGroup;
    	      this.entryId = defaults.entryId;
    	      this.gcsFilesetSpec = defaults.gcsFilesetSpec;
    	      this.linkedResource = defaults.linkedResource;
    	      this.schema = defaults.schema;
    	      this.type = defaults.type;
    	      this.userSpecifiedSystem = defaults.userSpecifiedSystem;
    	      this.userSpecifiedType = defaults.userSpecifiedType;
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
        public Builder entryGroup(Output<String> entryGroup) {
            this.entryGroup = Objects.requireNonNull(entryGroup);
            return this;
        }
        public Builder entryGroup(String entryGroup) {
            this.entryGroup = Output.of(Objects.requireNonNull(entryGroup));
            return this;
        }
        public Builder entryId(Output<String> entryId) {
            this.entryId = Objects.requireNonNull(entryId);
            return this;
        }
        public Builder entryId(String entryId) {
            this.entryId = Output.of(Objects.requireNonNull(entryId));
            return this;
        }
        public Builder gcsFilesetSpec(@Nullable Output<EntryGcsFilesetSpecArgs> gcsFilesetSpec) {
            this.gcsFilesetSpec = gcsFilesetSpec;
            return this;
        }
        public Builder gcsFilesetSpec(@Nullable EntryGcsFilesetSpecArgs gcsFilesetSpec) {
            this.gcsFilesetSpec = Codegen.ofNullable(gcsFilesetSpec);
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
        }        public EntryArgs build() {
            return new EntryArgs(description, displayName, entryGroup, entryId, gcsFilesetSpec, linkedResource, schema, type, userSpecifiedSystem, userSpecifiedType);
        }
    }
}
