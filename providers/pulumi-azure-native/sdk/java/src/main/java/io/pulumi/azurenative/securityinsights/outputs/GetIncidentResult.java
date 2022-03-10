// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.IncidentAdditionalDataResponse;
import io.pulumi.azurenative.securityinsights.outputs.IncidentLabelResponse;
import io.pulumi.azurenative.securityinsights.outputs.IncidentOwnerInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIncidentResult {
    /**
     * Additional data on the incident
     * 
     */
    private final IncidentAdditionalDataResponse additionalData;
    /**
     * The reason the incident was closed
     * 
     */
    private final @Nullable String classification;
    /**
     * Describes the reason the incident was closed
     * 
     */
    private final @Nullable String classificationComment;
    /**
     * The classification reason the incident was closed with
     * 
     */
    private final @Nullable String classificationReason;
    /**
     * The time the incident was created
     * 
     */
    private final String createdTimeUtc;
    /**
     * The description of the incident
     * 
     */
    private final @Nullable String description;
    /**
     * Etag of the azure resource
     * 
     */
    private final @Nullable String etag;
    /**
     * The time of the first activity in the incident
     * 
     */
    private final @Nullable String firstActivityTimeUtc;
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * A sequential number
     * 
     */
    private final Integer incidentNumber;
    /**
     * The deep-link url to the incident in Azure portal
     * 
     */
    private final String incidentUrl;
    /**
     * List of labels relevant to this incident
     * 
     */
    private final @Nullable List<IncidentLabelResponse> labels;
    /**
     * The time of the last activity in the incident
     * 
     */
    private final @Nullable String lastActivityTimeUtc;
    /**
     * The last time the incident was updated
     * 
     */
    private final String lastModifiedTimeUtc;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * Describes a user that the incident is assigned to
     * 
     */
    private final @Nullable IncidentOwnerInfoResponse owner;
    /**
     * List of resource ids of Analytic rules related to the incident
     * 
     */
    private final List<String> relatedAnalyticRuleIds;
    /**
     * The severity of the incident
     * 
     */
    private final String severity;
    /**
     * The status of the incident
     * 
     */
    private final String status;
    /**
     * The title of the incident
     * 
     */
    private final String title;
    /**
     * Azure resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetIncidentResult(
        @OutputCustomType.Parameter("additionalData") IncidentAdditionalDataResponse additionalData,
        @OutputCustomType.Parameter("classification") @Nullable String classification,
        @OutputCustomType.Parameter("classificationComment") @Nullable String classificationComment,
        @OutputCustomType.Parameter("classificationReason") @Nullable String classificationReason,
        @OutputCustomType.Parameter("createdTimeUtc") String createdTimeUtc,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("etag") @Nullable String etag,
        @OutputCustomType.Parameter("firstActivityTimeUtc") @Nullable String firstActivityTimeUtc,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("incidentNumber") Integer incidentNumber,
        @OutputCustomType.Parameter("incidentUrl") String incidentUrl,
        @OutputCustomType.Parameter("labels") @Nullable List<IncidentLabelResponse> labels,
        @OutputCustomType.Parameter("lastActivityTimeUtc") @Nullable String lastActivityTimeUtc,
        @OutputCustomType.Parameter("lastModifiedTimeUtc") String lastModifiedTimeUtc,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("owner") @Nullable IncidentOwnerInfoResponse owner,
        @OutputCustomType.Parameter("relatedAnalyticRuleIds") List<String> relatedAnalyticRuleIds,
        @OutputCustomType.Parameter("severity") String severity,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("title") String title,
        @OutputCustomType.Parameter("type") String type) {
        this.additionalData = additionalData;
        this.classification = classification;
        this.classificationComment = classificationComment;
        this.classificationReason = classificationReason;
        this.createdTimeUtc = createdTimeUtc;
        this.description = description;
        this.etag = etag;
        this.firstActivityTimeUtc = firstActivityTimeUtc;
        this.id = id;
        this.incidentNumber = incidentNumber;
        this.incidentUrl = incidentUrl;
        this.labels = labels;
        this.lastActivityTimeUtc = lastActivityTimeUtc;
        this.lastModifiedTimeUtc = lastModifiedTimeUtc;
        this.name = name;
        this.owner = owner;
        this.relatedAnalyticRuleIds = relatedAnalyticRuleIds;
        this.severity = severity;
        this.status = status;
        this.title = title;
        this.type = type;
    }

    /**
     * Additional data on the incident
     * 
    */
    public IncidentAdditionalDataResponse getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The reason the incident was closed
     * 
    */
    public Optional<String> getClassification() {
        return Optional.ofNullable(this.classification);
    }
    /**
     * Describes the reason the incident was closed
     * 
    */
    public Optional<String> getClassificationComment() {
        return Optional.ofNullable(this.classificationComment);
    }
    /**
     * The classification reason the incident was closed with
     * 
    */
    public Optional<String> getClassificationReason() {
        return Optional.ofNullable(this.classificationReason);
    }
    /**
     * The time the incident was created
     * 
    */
    public String getCreatedTimeUtc() {
        return this.createdTimeUtc;
    }
    /**
     * The description of the incident
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Etag of the azure resource
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * The time of the first activity in the incident
     * 
    */
    public Optional<String> getFirstActivityTimeUtc() {
        return Optional.ofNullable(this.firstActivityTimeUtc);
    }
    /**
     * Azure resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * A sequential number
     * 
    */
    public Integer getIncidentNumber() {
        return this.incidentNumber;
    }
    /**
     * The deep-link url to the incident in Azure portal
     * 
    */
    public String getIncidentUrl() {
        return this.incidentUrl;
    }
    /**
     * List of labels relevant to this incident
     * 
    */
    public List<IncidentLabelResponse> getLabels() {
        return this.labels == null ? List.of() : this.labels;
    }
    /**
     * The time of the last activity in the incident
     * 
    */
    public Optional<String> getLastActivityTimeUtc() {
        return Optional.ofNullable(this.lastActivityTimeUtc);
    }
    /**
     * The last time the incident was updated
     * 
    */
    public String getLastModifiedTimeUtc() {
        return this.lastModifiedTimeUtc;
    }
    /**
     * Azure resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Describes a user that the incident is assigned to
     * 
    */
    public Optional<IncidentOwnerInfoResponse> getOwner() {
        return Optional.ofNullable(this.owner);
    }
    /**
     * List of resource ids of Analytic rules related to the incident
     * 
    */
    public List<String> getRelatedAnalyticRuleIds() {
        return this.relatedAnalyticRuleIds;
    }
    /**
     * The severity of the incident
     * 
    */
    public String getSeverity() {
        return this.severity;
    }
    /**
     * The status of the incident
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * The title of the incident
     * 
    */
    public String getTitle() {
        return this.title;
    }
    /**
     * Azure resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIncidentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IncidentAdditionalDataResponse additionalData;
        private @Nullable String classification;
        private @Nullable String classificationComment;
        private @Nullable String classificationReason;
        private String createdTimeUtc;
        private @Nullable String description;
        private @Nullable String etag;
        private @Nullable String firstActivityTimeUtc;
        private String id;
        private Integer incidentNumber;
        private String incidentUrl;
        private @Nullable List<IncidentLabelResponse> labels;
        private @Nullable String lastActivityTimeUtc;
        private String lastModifiedTimeUtc;
        private String name;
        private @Nullable IncidentOwnerInfoResponse owner;
        private List<String> relatedAnalyticRuleIds;
        private String severity;
        private String status;
        private String title;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIncidentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalData = defaults.additionalData;
    	      this.classification = defaults.classification;
    	      this.classificationComment = defaults.classificationComment;
    	      this.classificationReason = defaults.classificationReason;
    	      this.createdTimeUtc = defaults.createdTimeUtc;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.firstActivityTimeUtc = defaults.firstActivityTimeUtc;
    	      this.id = defaults.id;
    	      this.incidentNumber = defaults.incidentNumber;
    	      this.incidentUrl = defaults.incidentUrl;
    	      this.labels = defaults.labels;
    	      this.lastActivityTimeUtc = defaults.lastActivityTimeUtc;
    	      this.lastModifiedTimeUtc = defaults.lastModifiedTimeUtc;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.relatedAnalyticRuleIds = defaults.relatedAnalyticRuleIds;
    	      this.severity = defaults.severity;
    	      this.status = defaults.status;
    	      this.title = defaults.title;
    	      this.type = defaults.type;
        }

        public Builder additionalData(IncidentAdditionalDataResponse additionalData) {
            this.additionalData = Objects.requireNonNull(additionalData);
            return this;
        }

        public Builder classification(@Nullable String classification) {
            this.classification = classification;
            return this;
        }

        public Builder classificationComment(@Nullable String classificationComment) {
            this.classificationComment = classificationComment;
            return this;
        }

        public Builder classificationReason(@Nullable String classificationReason) {
            this.classificationReason = classificationReason;
            return this;
        }

        public Builder createdTimeUtc(String createdTimeUtc) {
            this.createdTimeUtc = Objects.requireNonNull(createdTimeUtc);
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder firstActivityTimeUtc(@Nullable String firstActivityTimeUtc) {
            this.firstActivityTimeUtc = firstActivityTimeUtc;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder incidentNumber(Integer incidentNumber) {
            this.incidentNumber = Objects.requireNonNull(incidentNumber);
            return this;
        }

        public Builder incidentUrl(String incidentUrl) {
            this.incidentUrl = Objects.requireNonNull(incidentUrl);
            return this;
        }

        public Builder labels(@Nullable List<IncidentLabelResponse> labels) {
            this.labels = labels;
            return this;
        }

        public Builder lastActivityTimeUtc(@Nullable String lastActivityTimeUtc) {
            this.lastActivityTimeUtc = lastActivityTimeUtc;
            return this;
        }

        public Builder lastModifiedTimeUtc(String lastModifiedTimeUtc) {
            this.lastModifiedTimeUtc = Objects.requireNonNull(lastModifiedTimeUtc);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder owner(@Nullable IncidentOwnerInfoResponse owner) {
            this.owner = owner;
            return this;
        }

        public Builder relatedAnalyticRuleIds(List<String> relatedAnalyticRuleIds) {
            this.relatedAnalyticRuleIds = Objects.requireNonNull(relatedAnalyticRuleIds);
            return this;
        }

        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetIncidentResult build() {
            return new GetIncidentResult(additionalData, classification, classificationComment, classificationReason, createdTimeUtc, description, etag, firstActivityTimeUtc, id, incidentNumber, incidentUrl, labels, lastActivityTimeUtc, lastModifiedTimeUtc, name, owner, relatedAnalyticRuleIds, severity, status, title, type);
        }
    }
}
