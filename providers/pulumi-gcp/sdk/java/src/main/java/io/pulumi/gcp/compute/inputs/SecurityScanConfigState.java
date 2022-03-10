// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.SecurityScanConfigAuthenticationGetArgs;
import io.pulumi.gcp.compute.inputs.SecurityScanConfigScheduleGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityScanConfigState extends io.pulumi.resources.ResourceArgs {

    public static final SecurityScanConfigState Empty = new SecurityScanConfigState();

    /**
     * The authentication configuration.
     * If specified, service will use the authentication configuration during scanning.
     * Structure is documented below.
     * 
     */
    @InputImport(name="authentication")
      private final @Nullable Input<SecurityScanConfigAuthenticationGetArgs> authentication;

    public Input<SecurityScanConfigAuthenticationGetArgs> getAuthentication() {
        return this.authentication == null ? Input.empty() : this.authentication;
    }

    /**
     * The blacklist URL patterns as described in
     * https://cloud.google.com/security-scanner/docs/excluded-urls
     * 
     */
    @InputImport(name="blacklistPatterns")
      private final @Nullable Input<List<String>> blacklistPatterns;

    public Input<List<String>> getBlacklistPatterns() {
        return this.blacklistPatterns == null ? Input.empty() : this.blacklistPatterns;
    }

    /**
     * The user provider display name of the ScanConfig.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Controls export of scan configurations and results to Cloud Security Command Center.
     * Default value is `ENABLED`.
     * Possible values are `ENABLED` and `DISABLED`.
     * 
     */
    @InputImport(name="exportToSecurityCommandCenter")
      private final @Nullable Input<String> exportToSecurityCommandCenter;

    public Input<String> getExportToSecurityCommandCenter() {
        return this.exportToSecurityCommandCenter == null ? Input.empty() : this.exportToSecurityCommandCenter;
    }

    /**
     * The maximum QPS during scanning. A valid value ranges from 5 to 20 inclusively.
     * Defaults to 15.
     * 
     */
    @InputImport(name="maxQps")
      private final @Nullable Input<Integer> maxQps;

    public Input<Integer> getMaxQps() {
        return this.maxQps == null ? Input.empty() : this.maxQps;
    }

    /**
     * A server defined name for this index. Format: 'projects/{{project}}/scanConfigs/{{server_generated_id}}'
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The schedule of the ScanConfig
     * Structure is documented below.
     * 
     */
    @InputImport(name="schedule")
      private final @Nullable Input<SecurityScanConfigScheduleGetArgs> schedule;

    public Input<SecurityScanConfigScheduleGetArgs> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    /**
     * The starting URLs from which the scanner finds site pages.
     * 
     */
    @InputImport(name="startingUrls")
      private final @Nullable Input<List<String>> startingUrls;

    public Input<List<String>> getStartingUrls() {
        return this.startingUrls == null ? Input.empty() : this.startingUrls;
    }

    /**
     * Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be used as a default.
     * Each value may be one of `APP_ENGINE` and `COMPUTE`.
     * 
     */
    @InputImport(name="targetPlatforms")
      private final @Nullable Input<List<String>> targetPlatforms;

    public Input<List<String>> getTargetPlatforms() {
        return this.targetPlatforms == null ? Input.empty() : this.targetPlatforms;
    }

    /**
     * Type of the user agents used for scanning
     * Default value is `CHROME_LINUX`.
     * Possible values are `USER_AGENT_UNSPECIFIED`, `CHROME_LINUX`, `CHROME_ANDROID`, and `SAFARI_IPHONE`.
     * 
     */
    @InputImport(name="userAgent")
      private final @Nullable Input<String> userAgent;

    public Input<String> getUserAgent() {
        return this.userAgent == null ? Input.empty() : this.userAgent;
    }

    public SecurityScanConfigState(
        @Nullable Input<SecurityScanConfigAuthenticationGetArgs> authentication,
        @Nullable Input<List<String>> blacklistPatterns,
        @Nullable Input<String> displayName,
        @Nullable Input<String> exportToSecurityCommandCenter,
        @Nullable Input<Integer> maxQps,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<SecurityScanConfigScheduleGetArgs> schedule,
        @Nullable Input<List<String>> startingUrls,
        @Nullable Input<List<String>> targetPlatforms,
        @Nullable Input<String> userAgent) {
        this.authentication = authentication;
        this.blacklistPatterns = blacklistPatterns;
        this.displayName = displayName;
        this.exportToSecurityCommandCenter = exportToSecurityCommandCenter;
        this.maxQps = maxQps;
        this.name = name;
        this.project = project;
        this.schedule = schedule;
        this.startingUrls = startingUrls;
        this.targetPlatforms = targetPlatforms;
        this.userAgent = userAgent;
    }

    private SecurityScanConfigState() {
        this.authentication = Input.empty();
        this.blacklistPatterns = Input.empty();
        this.displayName = Input.empty();
        this.exportToSecurityCommandCenter = Input.empty();
        this.maxQps = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.schedule = Input.empty();
        this.startingUrls = Input.empty();
        this.targetPlatforms = Input.empty();
        this.userAgent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityScanConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SecurityScanConfigAuthenticationGetArgs> authentication;
        private @Nullable Input<List<String>> blacklistPatterns;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> exportToSecurityCommandCenter;
        private @Nullable Input<Integer> maxQps;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<SecurityScanConfigScheduleGetArgs> schedule;
        private @Nullable Input<List<String>> startingUrls;
        private @Nullable Input<List<String>> targetPlatforms;
        private @Nullable Input<String> userAgent;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityScanConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.blacklistPatterns = defaults.blacklistPatterns;
    	      this.displayName = defaults.displayName;
    	      this.exportToSecurityCommandCenter = defaults.exportToSecurityCommandCenter;
    	      this.maxQps = defaults.maxQps;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.schedule = defaults.schedule;
    	      this.startingUrls = defaults.startingUrls;
    	      this.targetPlatforms = defaults.targetPlatforms;
    	      this.userAgent = defaults.userAgent;
        }

        public Builder authentication(@Nullable Input<SecurityScanConfigAuthenticationGetArgs> authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder authentication(@Nullable SecurityScanConfigAuthenticationGetArgs authentication) {
            this.authentication = Input.ofNullable(authentication);
            return this;
        }

        public Builder blacklistPatterns(@Nullable Input<List<String>> blacklistPatterns) {
            this.blacklistPatterns = blacklistPatterns;
            return this;
        }

        public Builder blacklistPatterns(@Nullable List<String> blacklistPatterns) {
            this.blacklistPatterns = Input.ofNullable(blacklistPatterns);
            return this;
        }

        public Builder displayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder exportToSecurityCommandCenter(@Nullable Input<String> exportToSecurityCommandCenter) {
            this.exportToSecurityCommandCenter = exportToSecurityCommandCenter;
            return this;
        }

        public Builder exportToSecurityCommandCenter(@Nullable String exportToSecurityCommandCenter) {
            this.exportToSecurityCommandCenter = Input.ofNullable(exportToSecurityCommandCenter);
            return this;
        }

        public Builder maxQps(@Nullable Input<Integer> maxQps) {
            this.maxQps = maxQps;
            return this;
        }

        public Builder maxQps(@Nullable Integer maxQps) {
            this.maxQps = Input.ofNullable(maxQps);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder schedule(@Nullable Input<SecurityScanConfigScheduleGetArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder schedule(@Nullable SecurityScanConfigScheduleGetArgs schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public Builder startingUrls(@Nullable Input<List<String>> startingUrls) {
            this.startingUrls = startingUrls;
            return this;
        }

        public Builder startingUrls(@Nullable List<String> startingUrls) {
            this.startingUrls = Input.ofNullable(startingUrls);
            return this;
        }

        public Builder targetPlatforms(@Nullable Input<List<String>> targetPlatforms) {
            this.targetPlatforms = targetPlatforms;
            return this;
        }

        public Builder targetPlatforms(@Nullable List<String> targetPlatforms) {
            this.targetPlatforms = Input.ofNullable(targetPlatforms);
            return this;
        }

        public Builder userAgent(@Nullable Input<String> userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        public Builder userAgent(@Nullable String userAgent) {
            this.userAgent = Input.ofNullable(userAgent);
            return this;
        }
        public SecurityScanConfigState build() {
            return new SecurityScanConfigState(authentication, blacklistPatterns, displayName, exportToSecurityCommandCenter, maxQps, name, project, schedule, startingUrls, targetPlatforms, userAgent);
        }
    }
}
