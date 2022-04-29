// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.SecurityScanConfigAuthenticationArgs;
import com.pulumi.gcp.compute.inputs.SecurityScanConfigScheduleArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityScanConfigArgs extends ResourceArgs {

    public static final SecurityScanConfigArgs Empty = new SecurityScanConfigArgs();

    /**
     * The authentication configuration.
     * If specified, service will use the authentication configuration during scanning.
     * Structure is documented below.
     * 
     */
    @Import(name="authentication")
    private @Nullable Output<SecurityScanConfigAuthenticationArgs> authentication;

    /**
     * @return The authentication configuration.
     * If specified, service will use the authentication configuration during scanning.
     * Structure is documented below.
     * 
     */
    public Optional<Output<SecurityScanConfigAuthenticationArgs>> authentication() {
        return Optional.ofNullable(this.authentication);
    }

    /**
     * The blacklist URL patterns as described in
     * https://cloud.google.com/security-scanner/docs/excluded-urls
     * 
     */
    @Import(name="blacklistPatterns")
    private @Nullable Output<List<String>> blacklistPatterns;

    /**
     * @return The blacklist URL patterns as described in
     * https://cloud.google.com/security-scanner/docs/excluded-urls
     * 
     */
    public Optional<Output<List<String>>> blacklistPatterns() {
        return Optional.ofNullable(this.blacklistPatterns);
    }

    /**
     * The user provider display name of the ScanConfig.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The user provider display name of the ScanConfig.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Controls export of scan configurations and results to Cloud Security Command Center.
     * Default value is `ENABLED`.
     * Possible values are `ENABLED` and `DISABLED`.
     * 
     */
    @Import(name="exportToSecurityCommandCenter")
    private @Nullable Output<String> exportToSecurityCommandCenter;

    /**
     * @return Controls export of scan configurations and results to Cloud Security Command Center.
     * Default value is `ENABLED`.
     * Possible values are `ENABLED` and `DISABLED`.
     * 
     */
    public Optional<Output<String>> exportToSecurityCommandCenter() {
        return Optional.ofNullable(this.exportToSecurityCommandCenter);
    }

    /**
     * The maximum QPS during scanning. A valid value ranges from 5 to 20 inclusively.
     * Defaults to 15.
     * 
     */
    @Import(name="maxQps")
    private @Nullable Output<Integer> maxQps;

    /**
     * @return The maximum QPS during scanning. A valid value ranges from 5 to 20 inclusively.
     * Defaults to 15.
     * 
     */
    public Optional<Output<Integer>> maxQps() {
        return Optional.ofNullable(this.maxQps);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The schedule of the ScanConfig
     * Structure is documented below.
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<SecurityScanConfigScheduleArgs> schedule;

    /**
     * @return The schedule of the ScanConfig
     * Structure is documented below.
     * 
     */
    public Optional<Output<SecurityScanConfigScheduleArgs>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * The starting URLs from which the scanner finds site pages.
     * 
     */
    @Import(name="startingUrls", required=true)
    private Output<List<String>> startingUrls;

    /**
     * @return The starting URLs from which the scanner finds site pages.
     * 
     */
    public Output<List<String>> startingUrls() {
        return this.startingUrls;
    }

    /**
     * Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be used as a default.
     * Each value may be one of `APP_ENGINE` and `COMPUTE`.
     * 
     */
    @Import(name="targetPlatforms")
    private @Nullable Output<List<String>> targetPlatforms;

    /**
     * @return Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be used as a default.
     * Each value may be one of `APP_ENGINE` and `COMPUTE`.
     * 
     */
    public Optional<Output<List<String>>> targetPlatforms() {
        return Optional.ofNullable(this.targetPlatforms);
    }

    /**
     * Type of the user agents used for scanning
     * Default value is `CHROME_LINUX`.
     * Possible values are `USER_AGENT_UNSPECIFIED`, `CHROME_LINUX`, `CHROME_ANDROID`, and `SAFARI_IPHONE`.
     * 
     */
    @Import(name="userAgent")
    private @Nullable Output<String> userAgent;

    /**
     * @return Type of the user agents used for scanning
     * Default value is `CHROME_LINUX`.
     * Possible values are `USER_AGENT_UNSPECIFIED`, `CHROME_LINUX`, `CHROME_ANDROID`, and `SAFARI_IPHONE`.
     * 
     */
    public Optional<Output<String>> userAgent() {
        return Optional.ofNullable(this.userAgent);
    }

    private SecurityScanConfigArgs() {}

    private SecurityScanConfigArgs(SecurityScanConfigArgs $) {
        this.authentication = $.authentication;
        this.blacklistPatterns = $.blacklistPatterns;
        this.displayName = $.displayName;
        this.exportToSecurityCommandCenter = $.exportToSecurityCommandCenter;
        this.maxQps = $.maxQps;
        this.project = $.project;
        this.schedule = $.schedule;
        this.startingUrls = $.startingUrls;
        this.targetPlatforms = $.targetPlatforms;
        this.userAgent = $.userAgent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityScanConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityScanConfigArgs $;

        public Builder() {
            $ = new SecurityScanConfigArgs();
        }

        public Builder(SecurityScanConfigArgs defaults) {
            $ = new SecurityScanConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authentication The authentication configuration.
         * If specified, service will use the authentication configuration during scanning.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder authentication(@Nullable Output<SecurityScanConfigAuthenticationArgs> authentication) {
            $.authentication = authentication;
            return this;
        }

        /**
         * @param authentication The authentication configuration.
         * If specified, service will use the authentication configuration during scanning.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder authentication(SecurityScanConfigAuthenticationArgs authentication) {
            return authentication(Output.of(authentication));
        }

        /**
         * @param blacklistPatterns The blacklist URL patterns as described in
         * https://cloud.google.com/security-scanner/docs/excluded-urls
         * 
         * @return builder
         * 
         */
        public Builder blacklistPatterns(@Nullable Output<List<String>> blacklistPatterns) {
            $.blacklistPatterns = blacklistPatterns;
            return this;
        }

        /**
         * @param blacklistPatterns The blacklist URL patterns as described in
         * https://cloud.google.com/security-scanner/docs/excluded-urls
         * 
         * @return builder
         * 
         */
        public Builder blacklistPatterns(List<String> blacklistPatterns) {
            return blacklistPatterns(Output.of(blacklistPatterns));
        }

        /**
         * @param blacklistPatterns The blacklist URL patterns as described in
         * https://cloud.google.com/security-scanner/docs/excluded-urls
         * 
         * @return builder
         * 
         */
        public Builder blacklistPatterns(String... blacklistPatterns) {
            return blacklistPatterns(List.of(blacklistPatterns));
        }

        /**
         * @param displayName The user provider display name of the ScanConfig.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The user provider display name of the ScanConfig.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param exportToSecurityCommandCenter Controls export of scan configurations and results to Cloud Security Command Center.
         * Default value is `ENABLED`.
         * Possible values are `ENABLED` and `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder exportToSecurityCommandCenter(@Nullable Output<String> exportToSecurityCommandCenter) {
            $.exportToSecurityCommandCenter = exportToSecurityCommandCenter;
            return this;
        }

        /**
         * @param exportToSecurityCommandCenter Controls export of scan configurations and results to Cloud Security Command Center.
         * Default value is `ENABLED`.
         * Possible values are `ENABLED` and `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder exportToSecurityCommandCenter(String exportToSecurityCommandCenter) {
            return exportToSecurityCommandCenter(Output.of(exportToSecurityCommandCenter));
        }

        /**
         * @param maxQps The maximum QPS during scanning. A valid value ranges from 5 to 20 inclusively.
         * Defaults to 15.
         * 
         * @return builder
         * 
         */
        public Builder maxQps(@Nullable Output<Integer> maxQps) {
            $.maxQps = maxQps;
            return this;
        }

        /**
         * @param maxQps The maximum QPS during scanning. A valid value ranges from 5 to 20 inclusively.
         * Defaults to 15.
         * 
         * @return builder
         * 
         */
        public Builder maxQps(Integer maxQps) {
            return maxQps(Output.of(maxQps));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param schedule The schedule of the ScanConfig
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<SecurityScanConfigScheduleArgs> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule The schedule of the ScanConfig
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder schedule(SecurityScanConfigScheduleArgs schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param startingUrls The starting URLs from which the scanner finds site pages.
         * 
         * @return builder
         * 
         */
        public Builder startingUrls(Output<List<String>> startingUrls) {
            $.startingUrls = startingUrls;
            return this;
        }

        /**
         * @param startingUrls The starting URLs from which the scanner finds site pages.
         * 
         * @return builder
         * 
         */
        public Builder startingUrls(List<String> startingUrls) {
            return startingUrls(Output.of(startingUrls));
        }

        /**
         * @param startingUrls The starting URLs from which the scanner finds site pages.
         * 
         * @return builder
         * 
         */
        public Builder startingUrls(String... startingUrls) {
            return startingUrls(List.of(startingUrls));
        }

        /**
         * @param targetPlatforms Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be used as a default.
         * Each value may be one of `APP_ENGINE` and `COMPUTE`.
         * 
         * @return builder
         * 
         */
        public Builder targetPlatforms(@Nullable Output<List<String>> targetPlatforms) {
            $.targetPlatforms = targetPlatforms;
            return this;
        }

        /**
         * @param targetPlatforms Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be used as a default.
         * Each value may be one of `APP_ENGINE` and `COMPUTE`.
         * 
         * @return builder
         * 
         */
        public Builder targetPlatforms(List<String> targetPlatforms) {
            return targetPlatforms(Output.of(targetPlatforms));
        }

        /**
         * @param targetPlatforms Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be used as a default.
         * Each value may be one of `APP_ENGINE` and `COMPUTE`.
         * 
         * @return builder
         * 
         */
        public Builder targetPlatforms(String... targetPlatforms) {
            return targetPlatforms(List.of(targetPlatforms));
        }

        /**
         * @param userAgent Type of the user agents used for scanning
         * Default value is `CHROME_LINUX`.
         * Possible values are `USER_AGENT_UNSPECIFIED`, `CHROME_LINUX`, `CHROME_ANDROID`, and `SAFARI_IPHONE`.
         * 
         * @return builder
         * 
         */
        public Builder userAgent(@Nullable Output<String> userAgent) {
            $.userAgent = userAgent;
            return this;
        }

        /**
         * @param userAgent Type of the user agents used for scanning
         * Default value is `CHROME_LINUX`.
         * Possible values are `USER_AGENT_UNSPECIFIED`, `CHROME_LINUX`, `CHROME_ANDROID`, and `SAFARI_IPHONE`.
         * 
         * @return builder
         * 
         */
        public Builder userAgent(String userAgent) {
            return userAgent(Output.of(userAgent));
        }

        public SecurityScanConfigArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.startingUrls = Objects.requireNonNull($.startingUrls, "expected parameter 'startingUrls' to be non-null");
            return $;
        }
    }

}
