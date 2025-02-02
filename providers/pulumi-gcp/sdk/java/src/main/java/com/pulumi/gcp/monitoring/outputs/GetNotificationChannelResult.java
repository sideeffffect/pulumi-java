// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.monitoring.outputs.GetNotificationChannelSensitiveLabel;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNotificationChannelResult {
    private final String description;
    private final @Nullable String displayName;
    private final Boolean enabled;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable Map<String,String> labels;
    private final String name;
    private final @Nullable String project;
    private final List<GetNotificationChannelSensitiveLabel> sensitiveLabels;
    private final @Nullable String type;
    private final @Nullable Map<String,String> userLabels;
    private final String verificationStatus;

    @CustomType.Constructor
    private GetNotificationChannelResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("labels") @Nullable Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("project") @Nullable String project,
        @CustomType.Parameter("sensitiveLabels") List<GetNotificationChannelSensitiveLabel> sensitiveLabels,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("userLabels") @Nullable Map<String,String> userLabels,
        @CustomType.Parameter("verificationStatus") String verificationStatus) {
        this.description = description;
        this.displayName = displayName;
        this.enabled = enabled;
        this.id = id;
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.sensitiveLabels = sensitiveLabels;
        this.type = type;
        this.userLabels = userLabels;
        this.verificationStatus = verificationStatus;
    }

    public String description() {
        return this.description;
    }
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Map<String,String> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public List<GetNotificationChannelSensitiveLabel> sensitiveLabels() {
        return this.sensitiveLabels;
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    public Map<String,String> userLabels() {
        return this.userLabels == null ? Map.of() : this.userLabels;
    }
    public String verificationStatus() {
        return this.verificationStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotificationChannelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private @Nullable String displayName;
        private Boolean enabled;
        private String id;
        private @Nullable Map<String,String> labels;
        private String name;
        private @Nullable String project;
        private List<GetNotificationChannelSensitiveLabel> sensitiveLabels;
        private @Nullable String type;
        private @Nullable Map<String,String> userLabels;
        private String verificationStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNotificationChannelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.sensitiveLabels = defaults.sensitiveLabels;
    	      this.type = defaults.type;
    	      this.userLabels = defaults.userLabels;
    	      this.verificationStatus = defaults.verificationStatus;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder sensitiveLabels(List<GetNotificationChannelSensitiveLabel> sensitiveLabels) {
            this.sensitiveLabels = Objects.requireNonNull(sensitiveLabels);
            return this;
        }
        public Builder sensitiveLabels(GetNotificationChannelSensitiveLabel... sensitiveLabels) {
            return sensitiveLabels(List.of(sensitiveLabels));
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder userLabels(@Nullable Map<String,String> userLabels) {
            this.userLabels = userLabels;
            return this;
        }
        public Builder verificationStatus(String verificationStatus) {
            this.verificationStatus = Objects.requireNonNull(verificationStatus);
            return this;
        }        public GetNotificationChannelResult build() {
            return new GetNotificationChannelResult(description, displayName, enabled, id, labels, name, project, sensitiveLabels, type, userLabels, verificationStatus);
        }
    }
}
