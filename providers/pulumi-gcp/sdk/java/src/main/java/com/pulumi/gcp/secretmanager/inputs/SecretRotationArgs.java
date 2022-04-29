// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretRotationArgs extends ResourceArgs {

    public static final SecretRotationArgs Empty = new SecretRotationArgs();

    /**
     * Timestamp in UTC at which the Secret is scheduled to rotate.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="nextRotationTime")
    private @Nullable Output<String> nextRotationTime;

    /**
     * @return Timestamp in UTC at which the Secret is scheduled to rotate.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> nextRotationTime() {
        return Optional.ofNullable(this.nextRotationTime);
    }

    /**
     * The Duration between rotation notifications. Must be in seconds and at least 3600s (1h) and at most 3153600000s (100 years).
     * If rotationPeriod is set, `next_rotation_time` must be set. `next_rotation_time` will be advanced by this period when the service automatically sends rotation notifications.
     * 
     */
    @Import(name="rotationPeriod")
    private @Nullable Output<String> rotationPeriod;

    /**
     * @return The Duration between rotation notifications. Must be in seconds and at least 3600s (1h) and at most 3153600000s (100 years).
     * If rotationPeriod is set, `next_rotation_time` must be set. `next_rotation_time` will be advanced by this period when the service automatically sends rotation notifications.
     * 
     */
    public Optional<Output<String>> rotationPeriod() {
        return Optional.ofNullable(this.rotationPeriod);
    }

    private SecretRotationArgs() {}

    private SecretRotationArgs(SecretRotationArgs $) {
        this.nextRotationTime = $.nextRotationTime;
        this.rotationPeriod = $.rotationPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretRotationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretRotationArgs $;

        public Builder() {
            $ = new SecretRotationArgs();
        }

        public Builder(SecretRotationArgs defaults) {
            $ = new SecretRotationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nextRotationTime Timestamp in UTC at which the Secret is scheduled to rotate.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder nextRotationTime(@Nullable Output<String> nextRotationTime) {
            $.nextRotationTime = nextRotationTime;
            return this;
        }

        /**
         * @param nextRotationTime Timestamp in UTC at which the Secret is scheduled to rotate.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder nextRotationTime(String nextRotationTime) {
            return nextRotationTime(Output.of(nextRotationTime));
        }

        /**
         * @param rotationPeriod The Duration between rotation notifications. Must be in seconds and at least 3600s (1h) and at most 3153600000s (100 years).
         * If rotationPeriod is set, `next_rotation_time` must be set. `next_rotation_time` will be advanced by this period when the service automatically sends rotation notifications.
         * 
         * @return builder
         * 
         */
        public Builder rotationPeriod(@Nullable Output<String> rotationPeriod) {
            $.rotationPeriod = rotationPeriod;
            return this;
        }

        /**
         * @param rotationPeriod The Duration between rotation notifications. Must be in seconds and at least 3600s (1h) and at most 3153600000s (100 years).
         * If rotationPeriod is set, `next_rotation_time` must be set. `next_rotation_time` will be advanced by this period when the service automatically sends rotation notifications.
         * 
         * @return builder
         * 
         */
        public Builder rotationPeriod(String rotationPeriod) {
            return rotationPeriod(Output.of(rotationPeriod));
        }

        public SecretRotationArgs build() {
            return $;
        }
    }

}
