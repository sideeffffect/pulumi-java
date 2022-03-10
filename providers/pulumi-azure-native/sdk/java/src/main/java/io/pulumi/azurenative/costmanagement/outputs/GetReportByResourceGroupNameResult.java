// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.azurenative.costmanagement.outputs.ReportDefinitionResponse;
import io.pulumi.azurenative.costmanagement.outputs.ReportDeliveryInfoResponse;
import io.pulumi.azurenative.costmanagement.outputs.ReportScheduleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetReportByResourceGroupNameResult {
    /**
     * Has definition for the report.
     * 
     */
    private final ReportDefinitionResponse definition;
    /**
     * Has delivery information for the report.
     * 
     */
    private final ReportDeliveryInfoResponse deliveryInfo;
    /**
     * The format of the report being delivered.
     * 
     */
    private final @Nullable String format;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Has schedule information for the report.
     * 
     */
    private final @Nullable ReportScheduleResponse schedule;
    /**
     * Resource tags.
     * 
     */
    private final Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetReportByResourceGroupNameResult(
        @OutputCustomType.Parameter("definition") ReportDefinitionResponse definition,
        @OutputCustomType.Parameter("deliveryInfo") ReportDeliveryInfoResponse deliveryInfo,
        @OutputCustomType.Parameter("format") @Nullable String format,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("schedule") @Nullable ReportScheduleResponse schedule,
        @OutputCustomType.Parameter("tags") Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type) {
        this.definition = definition;
        this.deliveryInfo = deliveryInfo;
        this.format = format;
        this.id = id;
        this.name = name;
        this.schedule = schedule;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Has definition for the report.
     * 
    */
    public ReportDefinitionResponse getDefinition() {
        return this.definition;
    }
    /**
     * Has delivery information for the report.
     * 
    */
    public ReportDeliveryInfoResponse getDeliveryInfo() {
        return this.deliveryInfo;
    }
    /**
     * The format of the report being delivered.
     * 
    */
    public Optional<String> getFormat() {
        return Optional.ofNullable(this.format);
    }
    /**
     * Resource Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Has schedule information for the report.
     * 
    */
    public Optional<ReportScheduleResponse> getSchedule() {
        return Optional.ofNullable(this.schedule);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReportByResourceGroupNameResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportDefinitionResponse definition;
        private ReportDeliveryInfoResponse deliveryInfo;
        private @Nullable String format;
        private String id;
        private String name;
        private @Nullable ReportScheduleResponse schedule;
        private Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReportByResourceGroupNameResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.deliveryInfo = defaults.deliveryInfo;
    	      this.format = defaults.format;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder definition(ReportDefinitionResponse definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }

        public Builder deliveryInfo(ReportDeliveryInfoResponse deliveryInfo) {
            this.deliveryInfo = Objects.requireNonNull(deliveryInfo);
            return this;
        }

        public Builder format(@Nullable String format) {
            this.format = format;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder schedule(@Nullable ReportScheduleResponse schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetReportByResourceGroupNameResult build() {
            return new GetReportByResourceGroupNameResult(definition, deliveryInfo, format, id, name, schedule, tags, type);
        }
    }
}
