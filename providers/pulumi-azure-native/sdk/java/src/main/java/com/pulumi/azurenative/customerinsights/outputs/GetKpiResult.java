// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.outputs;

import com.pulumi.azurenative.customerinsights.outputs.KpiAliasResponse;
import com.pulumi.azurenative.customerinsights.outputs.KpiExtractResponse;
import com.pulumi.azurenative.customerinsights.outputs.KpiGroupByMetadataResponse;
import com.pulumi.azurenative.customerinsights.outputs.KpiParticipantProfilesMetadataResponse;
import com.pulumi.azurenative.customerinsights.outputs.KpiThresholdsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetKpiResult {
    /**
     * @return The aliases.
     * 
     */
    private final @Nullable List<KpiAliasResponse> aliases;
    /**
     * @return The calculation window.
     * 
     */
    private final String calculationWindow;
    /**
     * @return Name of calculation window field.
     * 
     */
    private final @Nullable String calculationWindowFieldName;
    /**
     * @return Localized description for the KPI.
     * 
     */
    private final @Nullable Map<String,String> description;
    /**
     * @return Localized display name for the KPI.
     * 
     */
    private final @Nullable Map<String,String> displayName;
    /**
     * @return The mapping entity type.
     * 
     */
    private final String entityType;
    /**
     * @return The mapping entity name.
     * 
     */
    private final String entityTypeName;
    /**
     * @return The computation expression for the KPI.
     * 
     */
    private final String expression;
    /**
     * @return The KPI extracts.
     * 
     */
    private final @Nullable List<KpiExtractResponse> extracts;
    /**
     * @return The filter expression for the KPI.
     * 
     */
    private final @Nullable String filter;
    /**
     * @return The computation function for the KPI.
     * 
     */
    private final String function;
    /**
     * @return the group by properties for the KPI.
     * 
     */
    private final @Nullable List<String> groupBy;
    /**
     * @return The KPI GroupByMetadata.
     * 
     */
    private final List<KpiGroupByMetadataResponse> groupByMetadata;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return The KPI name.
     * 
     */
    private final String kpiName;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return The participant profiles.
     * 
     */
    private final List<KpiParticipantProfilesMetadataResponse> participantProfilesMetadata;
    /**
     * @return Provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * @return The hub name.
     * 
     */
    private final String tenantId;
    /**
     * @return The KPI thresholds.
     * 
     */
    private final @Nullable KpiThresholdsResponse thresHolds;
    /**
     * @return Resource type.
     * 
     */
    private final String type;
    /**
     * @return The unit of measurement for the KPI.
     * 
     */
    private final @Nullable String unit;

    @CustomType.Constructor
    private GetKpiResult(
        @CustomType.Parameter("aliases") @Nullable List<KpiAliasResponse> aliases,
        @CustomType.Parameter("calculationWindow") String calculationWindow,
        @CustomType.Parameter("calculationWindowFieldName") @Nullable String calculationWindowFieldName,
        @CustomType.Parameter("description") @Nullable Map<String,String> description,
        @CustomType.Parameter("displayName") @Nullable Map<String,String> displayName,
        @CustomType.Parameter("entityType") String entityType,
        @CustomType.Parameter("entityTypeName") String entityTypeName,
        @CustomType.Parameter("expression") String expression,
        @CustomType.Parameter("extracts") @Nullable List<KpiExtractResponse> extracts,
        @CustomType.Parameter("filter") @Nullable String filter,
        @CustomType.Parameter("function") String function,
        @CustomType.Parameter("groupBy") @Nullable List<String> groupBy,
        @CustomType.Parameter("groupByMetadata") List<KpiGroupByMetadataResponse> groupByMetadata,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kpiName") String kpiName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("participantProfilesMetadata") List<KpiParticipantProfilesMetadataResponse> participantProfilesMetadata,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("thresHolds") @Nullable KpiThresholdsResponse thresHolds,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("unit") @Nullable String unit) {
        this.aliases = aliases;
        this.calculationWindow = calculationWindow;
        this.calculationWindowFieldName = calculationWindowFieldName;
        this.description = description;
        this.displayName = displayName;
        this.entityType = entityType;
        this.entityTypeName = entityTypeName;
        this.expression = expression;
        this.extracts = extracts;
        this.filter = filter;
        this.function = function;
        this.groupBy = groupBy;
        this.groupByMetadata = groupByMetadata;
        this.id = id;
        this.kpiName = kpiName;
        this.name = name;
        this.participantProfilesMetadata = participantProfilesMetadata;
        this.provisioningState = provisioningState;
        this.tenantId = tenantId;
        this.thresHolds = thresHolds;
        this.type = type;
        this.unit = unit;
    }

    /**
     * @return The aliases.
     * 
     */
    public List<KpiAliasResponse> aliases() {
        return this.aliases == null ? List.of() : this.aliases;
    }
    /**
     * @return The calculation window.
     * 
     */
    public String calculationWindow() {
        return this.calculationWindow;
    }
    /**
     * @return Name of calculation window field.
     * 
     */
    public Optional<String> calculationWindowFieldName() {
        return Optional.ofNullable(this.calculationWindowFieldName);
    }
    /**
     * @return Localized description for the KPI.
     * 
     */
    public Map<String,String> description() {
        return this.description == null ? Map.of() : this.description;
    }
    /**
     * @return Localized display name for the KPI.
     * 
     */
    public Map<String,String> displayName() {
        return this.displayName == null ? Map.of() : this.displayName;
    }
    /**
     * @return The mapping entity type.
     * 
     */
    public String entityType() {
        return this.entityType;
    }
    /**
     * @return The mapping entity name.
     * 
     */
    public String entityTypeName() {
        return this.entityTypeName;
    }
    /**
     * @return The computation expression for the KPI.
     * 
     */
    public String expression() {
        return this.expression;
    }
    /**
     * @return The KPI extracts.
     * 
     */
    public List<KpiExtractResponse> extracts() {
        return this.extracts == null ? List.of() : this.extracts;
    }
    /**
     * @return The filter expression for the KPI.
     * 
     */
    public Optional<String> filter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * @return The computation function for the KPI.
     * 
     */
    public String function() {
        return this.function;
    }
    /**
     * @return the group by properties for the KPI.
     * 
     */
    public List<String> groupBy() {
        return this.groupBy == null ? List.of() : this.groupBy;
    }
    /**
     * @return The KPI GroupByMetadata.
     * 
     */
    public List<KpiGroupByMetadataResponse> groupByMetadata() {
        return this.groupByMetadata;
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The KPI name.
     * 
     */
    public String kpiName() {
        return this.kpiName;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The participant profiles.
     * 
     */
    public List<KpiParticipantProfilesMetadataResponse> participantProfilesMetadata() {
        return this.participantProfilesMetadata;
    }
    /**
     * @return Provisioning state.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The hub name.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return The KPI thresholds.
     * 
     */
    public Optional<KpiThresholdsResponse> thresHolds() {
        return Optional.ofNullable(this.thresHolds);
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The unit of measurement for the KPI.
     * 
     */
    public Optional<String> unit() {
        return Optional.ofNullable(this.unit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKpiResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<KpiAliasResponse> aliases;
        private String calculationWindow;
        private @Nullable String calculationWindowFieldName;
        private @Nullable Map<String,String> description;
        private @Nullable Map<String,String> displayName;
        private String entityType;
        private String entityTypeName;
        private String expression;
        private @Nullable List<KpiExtractResponse> extracts;
        private @Nullable String filter;
        private String function;
        private @Nullable List<String> groupBy;
        private List<KpiGroupByMetadataResponse> groupByMetadata;
        private String id;
        private String kpiName;
        private String name;
        private List<KpiParticipantProfilesMetadataResponse> participantProfilesMetadata;
        private String provisioningState;
        private String tenantId;
        private @Nullable KpiThresholdsResponse thresHolds;
        private String type;
        private @Nullable String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKpiResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.calculationWindow = defaults.calculationWindow;
    	      this.calculationWindowFieldName = defaults.calculationWindowFieldName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.entityType = defaults.entityType;
    	      this.entityTypeName = defaults.entityTypeName;
    	      this.expression = defaults.expression;
    	      this.extracts = defaults.extracts;
    	      this.filter = defaults.filter;
    	      this.function = defaults.function;
    	      this.groupBy = defaults.groupBy;
    	      this.groupByMetadata = defaults.groupByMetadata;
    	      this.id = defaults.id;
    	      this.kpiName = defaults.kpiName;
    	      this.name = defaults.name;
    	      this.participantProfilesMetadata = defaults.participantProfilesMetadata;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tenantId = defaults.tenantId;
    	      this.thresHolds = defaults.thresHolds;
    	      this.type = defaults.type;
    	      this.unit = defaults.unit;
        }

        public Builder aliases(@Nullable List<KpiAliasResponse> aliases) {
            this.aliases = aliases;
            return this;
        }
        public Builder aliases(KpiAliasResponse... aliases) {
            return aliases(List.of(aliases));
        }
        public Builder calculationWindow(String calculationWindow) {
            this.calculationWindow = Objects.requireNonNull(calculationWindow);
            return this;
        }
        public Builder calculationWindowFieldName(@Nullable String calculationWindowFieldName) {
            this.calculationWindowFieldName = calculationWindowFieldName;
            return this;
        }
        public Builder description(@Nullable Map<String,String> description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable Map<String,String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder entityType(String entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }
        public Builder entityTypeName(String entityTypeName) {
            this.entityTypeName = Objects.requireNonNull(entityTypeName);
            return this;
        }
        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public Builder extracts(@Nullable List<KpiExtractResponse> extracts) {
            this.extracts = extracts;
            return this;
        }
        public Builder extracts(KpiExtractResponse... extracts) {
            return extracts(List.of(extracts));
        }
        public Builder filter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }
        public Builder function(String function) {
            this.function = Objects.requireNonNull(function);
            return this;
        }
        public Builder groupBy(@Nullable List<String> groupBy) {
            this.groupBy = groupBy;
            return this;
        }
        public Builder groupBy(String... groupBy) {
            return groupBy(List.of(groupBy));
        }
        public Builder groupByMetadata(List<KpiGroupByMetadataResponse> groupByMetadata) {
            this.groupByMetadata = Objects.requireNonNull(groupByMetadata);
            return this;
        }
        public Builder groupByMetadata(KpiGroupByMetadataResponse... groupByMetadata) {
            return groupByMetadata(List.of(groupByMetadata));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kpiName(String kpiName) {
            this.kpiName = Objects.requireNonNull(kpiName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder participantProfilesMetadata(List<KpiParticipantProfilesMetadataResponse> participantProfilesMetadata) {
            this.participantProfilesMetadata = Objects.requireNonNull(participantProfilesMetadata);
            return this;
        }
        public Builder participantProfilesMetadata(KpiParticipantProfilesMetadataResponse... participantProfilesMetadata) {
            return participantProfilesMetadata(List.of(participantProfilesMetadata));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder thresHolds(@Nullable KpiThresholdsResponse thresHolds) {
            this.thresHolds = thresHolds;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder unit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }        public GetKpiResult build() {
            return new GetKpiResult(aliases, calculationWindow, calculationWindowFieldName, description, displayName, entityType, entityTypeName, expression, extracts, filter, function, groupBy, groupByMetadata, id, kpiName, name, participantProfilesMetadata, provisioningState, tenantId, thresHolds, type, unit);
        }
    }
}
