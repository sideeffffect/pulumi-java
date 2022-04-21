// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Information required to reset the timer. The timer is reset to the previously evaluated result of the duration. The duration expression isn&#39;t reevaluated when you reset the timer.
 * 
 */
public final class DetectorModelResetTimer extends com.pulumi.resources.InvokeArgs {

    public static final DetectorModelResetTimer Empty = new DetectorModelResetTimer();

    /**
     * The name of the timer to reset.
     * 
     */
    @Import(name="timerName", required=true)
    private String timerName;

    public String timerName() {
        return this.timerName;
    }

    private DetectorModelResetTimer() {}

    private DetectorModelResetTimer(DetectorModelResetTimer $) {
        this.timerName = $.timerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DetectorModelResetTimer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetectorModelResetTimer $;

        public Builder() {
            $ = new DetectorModelResetTimer();
        }

        public Builder(DetectorModelResetTimer defaults) {
            $ = new DetectorModelResetTimer(Objects.requireNonNull(defaults));
        }

        public Builder timerName(String timerName) {
            $.timerName = timerName;
            return this;
        }

        public DetectorModelResetTimer build() {
            $.timerName = Objects.requireNonNull($.timerName, "expected parameter 'timerName' to be non-null");
            return $;
        }
    }

}
