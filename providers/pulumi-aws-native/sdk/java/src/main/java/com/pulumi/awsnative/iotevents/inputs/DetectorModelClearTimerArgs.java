// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Information needed to clear the timer.
 * 
 */
public final class DetectorModelClearTimerArgs extends com.pulumi.resources.ResourceArgs {

    public static final DetectorModelClearTimerArgs Empty = new DetectorModelClearTimerArgs();

    @Import(name="timerName", required=true)
    private Output<String> timerName;

    public Output<String> timerName() {
        return this.timerName;
    }

    private DetectorModelClearTimerArgs() {}

    private DetectorModelClearTimerArgs(DetectorModelClearTimerArgs $) {
        this.timerName = $.timerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DetectorModelClearTimerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetectorModelClearTimerArgs $;

        public Builder() {
            $ = new DetectorModelClearTimerArgs();
        }

        public Builder(DetectorModelClearTimerArgs defaults) {
            $ = new DetectorModelClearTimerArgs(Objects.requireNonNull(defaults));
        }

        public Builder timerName(Output<String> timerName) {
            $.timerName = timerName;
            return this;
        }

        public Builder timerName(String timerName) {
            return timerName(Output.of(timerName));
        }

        public DetectorModelClearTimerArgs build() {
            $.timerName = Objects.requireNonNull($.timerName, "expected parameter 'timerName' to be non-null");
            return $;
        }
    }

}
