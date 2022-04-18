// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.healthcare.inputs.FhirStoreNotificationConfigArgs;
import com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FhirStoreArgs extends com.pulumi.resources.ResourceArgs {

    public static final FhirStoreArgs Empty = new FhirStoreArgs();

    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * 
     */
    @Import(name="dataset", required=true)
      private final Output<String> dataset;

    public Output<String> dataset() {
        return this.dataset;
    }

    /**
     * Whether to disable referential integrity in this FHIR store. This field is immutable after FHIR store
     * creation. The default value is false, meaning that the API will enforce referential integrity and fail the
     * requests that will result in inconsistent state in the FHIR store. When this field is set to true, the API
     * will skip referential integrity check. Consequently, operations that rely on references, such as
     * Patient.get$everything, will not return all the results if broken references exist.
     * ** Changing this property may recreate the FHIR store (removing all data) **
     * 
     */
    @Import(name="disableReferentialIntegrity")
      private final @Nullable Output<Boolean> disableReferentialIntegrity;

    public Output<Boolean> disableReferentialIntegrity() {
        return this.disableReferentialIntegrity == null ? Codegen.empty() : this.disableReferentialIntegrity;
    }

    /**
     * Whether to disable resource versioning for this FHIR store. This field can not be changed after the creation
     * of FHIR store. If set to false, which is the default behavior, all write operations will cause historical
     * versions to be recorded automatically. The historical versions can be fetched through the history APIs, but
     * cannot be updated. If set to true, no historical versions will be kept. The server will send back errors for
     * attempts to read the historical versions.
     * ** Changing this property may recreate the FHIR store (removing all data) **
     * 
     */
    @Import(name="disableResourceVersioning")
      private final @Nullable Output<Boolean> disableResourceVersioning;

    public Output<Boolean> disableResourceVersioning() {
        return this.disableResourceVersioning == null ? Codegen.empty() : this.disableResourceVersioning;
    }

    /**
     * Whether to allow the bulk import API to accept history bundles and directly insert historical resource
     * versions into the FHIR store. Importing resource histories creates resource interactions that appear to have
     * occurred in the past, which clients may not want to allow. If set to false, history bundles within an import
     * will fail with an error.
     * ** Changing this property may recreate the FHIR store (removing all data) **
     * ** This property can be changed manually in the Google Cloud Healthcare admin console without recreating the FHIR store **
     * 
     */
    @Import(name="enableHistoryImport")
      private final @Nullable Output<Boolean> enableHistoryImport;

    public Output<Boolean> enableHistoryImport() {
        return this.enableHistoryImport == null ? Codegen.empty() : this.enableHistoryImport;
    }

    /**
     * Whether this FHIR store has the updateCreate capability. This determines if the client can use an Update
     * operation to create a new resource with a client-specified ID. If false, all IDs are server-assigned through
     * the Create operation and attempts to Update a non-existent resource will return errors. Please treat the audit
     * logs with appropriate levels of care if client-specified resource IDs contain sensitive data such as patient
     * identifiers, those IDs will be part of the FHIR resource path recorded in Cloud audit logs and Cloud Pub/Sub
     * notifications.
     * 
     */
    @Import(name="enableUpdateCreate")
      private final @Nullable Output<Boolean> enableUpdateCreate;

    public Output<Boolean> enableUpdateCreate() {
        return this.enableUpdateCreate == null ? Codegen.empty() : this.enableUpdateCreate;
    }

    /**
     * User-supplied key-value pairs used to organize FHIR stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of "key": value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The resource name for the FhirStore.
     * ** Changing this property may recreate the FHIR store (removing all data) **
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Import(name="notificationConfig")
      private final @Nullable Output<FhirStoreNotificationConfigArgs> notificationConfig;

    public Output<FhirStoreNotificationConfigArgs> notificationConfig() {
        return this.notificationConfig == null ? Codegen.empty() : this.notificationConfig;
    }

    /**
     * A list of streaming configs that configure the destinations of streaming export for every resource mutation in
     * this FHIR store. Each store is allowed to have up to 10 streaming configs. After a new config is added, the next
     * resource mutation is streamed to the new location in addition to the existing ones. When a location is removed
     * from the list, the server stops streaming to that location. Before adding a new config, you must add the required
     * bigquery.dataEditor role to your project's Cloud Healthcare Service Agent service account. Some lag (typically on
     * the order of dozens of seconds) is expected before the results show up in the streaming destination.
     * Structure is documented below.
     * 
     */
    @Import(name="streamConfigs")
      private final @Nullable Output<List<FhirStoreStreamConfigArgs>> streamConfigs;

    public Output<List<FhirStoreStreamConfigArgs>> streamConfigs() {
        return this.streamConfigs == null ? Codegen.empty() : this.streamConfigs;
    }

    /**
     * The FHIR specification version.
     * Default value is `STU3`.
     * Possible values are `DSTU2`, `STU3`, and `R4`.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public FhirStoreArgs(
        Output<String> dataset,
        @Nullable Output<Boolean> disableReferentialIntegrity,
        @Nullable Output<Boolean> disableResourceVersioning,
        @Nullable Output<Boolean> enableHistoryImport,
        @Nullable Output<Boolean> enableUpdateCreate,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<FhirStoreNotificationConfigArgs> notificationConfig,
        @Nullable Output<List<FhirStoreStreamConfigArgs>> streamConfigs,
        @Nullable Output<String> version) {
        this.dataset = Objects.requireNonNull(dataset, "expected parameter 'dataset' to be non-null");
        this.disableReferentialIntegrity = disableReferentialIntegrity;
        this.disableResourceVersioning = disableResourceVersioning;
        this.enableHistoryImport = enableHistoryImport;
        this.enableUpdateCreate = enableUpdateCreate;
        this.labels = labels;
        this.name = name;
        this.notificationConfig = notificationConfig;
        this.streamConfigs = streamConfigs;
        this.version = version;
    }

    private FhirStoreArgs() {
        this.dataset = Codegen.empty();
        this.disableReferentialIntegrity = Codegen.empty();
        this.disableResourceVersioning = Codegen.empty();
        this.enableHistoryImport = Codegen.empty();
        this.enableUpdateCreate = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.notificationConfig = Codegen.empty();
        this.streamConfigs = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dataset;
        private @Nullable Output<Boolean> disableReferentialIntegrity;
        private @Nullable Output<Boolean> disableResourceVersioning;
        private @Nullable Output<Boolean> enableHistoryImport;
        private @Nullable Output<Boolean> enableUpdateCreate;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<FhirStoreNotificationConfigArgs> notificationConfig;
        private @Nullable Output<List<FhirStoreStreamConfigArgs>> streamConfigs;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.disableReferentialIntegrity = defaults.disableReferentialIntegrity;
    	      this.disableResourceVersioning = defaults.disableResourceVersioning;
    	      this.enableHistoryImport = defaults.enableHistoryImport;
    	      this.enableUpdateCreate = defaults.enableUpdateCreate;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.streamConfigs = defaults.streamConfigs;
    	      this.version = defaults.version;
        }

        public Builder dataset(Output<String> dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }
        public Builder dataset(String dataset) {
            this.dataset = Output.of(Objects.requireNonNull(dataset));
            return this;
        }
        public Builder disableReferentialIntegrity(@Nullable Output<Boolean> disableReferentialIntegrity) {
            this.disableReferentialIntegrity = disableReferentialIntegrity;
            return this;
        }
        public Builder disableReferentialIntegrity(@Nullable Boolean disableReferentialIntegrity) {
            this.disableReferentialIntegrity = Codegen.ofNullable(disableReferentialIntegrity);
            return this;
        }
        public Builder disableResourceVersioning(@Nullable Output<Boolean> disableResourceVersioning) {
            this.disableResourceVersioning = disableResourceVersioning;
            return this;
        }
        public Builder disableResourceVersioning(@Nullable Boolean disableResourceVersioning) {
            this.disableResourceVersioning = Codegen.ofNullable(disableResourceVersioning);
            return this;
        }
        public Builder enableHistoryImport(@Nullable Output<Boolean> enableHistoryImport) {
            this.enableHistoryImport = enableHistoryImport;
            return this;
        }
        public Builder enableHistoryImport(@Nullable Boolean enableHistoryImport) {
            this.enableHistoryImport = Codegen.ofNullable(enableHistoryImport);
            return this;
        }
        public Builder enableUpdateCreate(@Nullable Output<Boolean> enableUpdateCreate) {
            this.enableUpdateCreate = enableUpdateCreate;
            return this;
        }
        public Builder enableUpdateCreate(@Nullable Boolean enableUpdateCreate) {
            this.enableUpdateCreate = Codegen.ofNullable(enableUpdateCreate);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
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
        public Builder notificationConfig(@Nullable Output<FhirStoreNotificationConfigArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }
        public Builder notificationConfig(@Nullable FhirStoreNotificationConfigArgs notificationConfig) {
            this.notificationConfig = Codegen.ofNullable(notificationConfig);
            return this;
        }
        public Builder streamConfigs(@Nullable Output<List<FhirStoreStreamConfigArgs>> streamConfigs) {
            this.streamConfigs = streamConfigs;
            return this;
        }
        public Builder streamConfigs(@Nullable List<FhirStoreStreamConfigArgs> streamConfigs) {
            this.streamConfigs = Codegen.ofNullable(streamConfigs);
            return this;
        }
        public Builder streamConfigs(FhirStoreStreamConfigArgs... streamConfigs) {
            return streamConfigs(List.of(streamConfigs));
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public FhirStoreArgs build() {
            return new FhirStoreArgs(dataset, disableReferentialIntegrity, disableResourceVersioning, enableHistoryImport, enableUpdateCreate, labels, name, notificationConfig, streamConfigs, version);
        }
    }
}
