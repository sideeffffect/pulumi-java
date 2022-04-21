// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.robomaker.inputs;

import com.pulumi.awsnative.robomaker.enums.RobotApplicationRobotSoftwareSuiteName;
import com.pulumi.awsnative.robomaker.enums.RobotApplicationRobotSoftwareSuiteVersion;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The robot software suite used by the robot application.
 * 
 */
public final class RobotApplicationRobotSoftwareSuite extends com.pulumi.resources.InvokeArgs {

    public static final RobotApplicationRobotSoftwareSuite Empty = new RobotApplicationRobotSoftwareSuite();

    /**
     * The name of robot software suite.
     * 
     */
    @Import(name="name", required=true)
    private RobotApplicationRobotSoftwareSuiteName name;

    public RobotApplicationRobotSoftwareSuiteName name() {
        return this.name;
    }

    /**
     * The version of robot software suite.
     * 
     */
    @Import(name="version")
    private @Nullable RobotApplicationRobotSoftwareSuiteVersion version;

    public Optional<RobotApplicationRobotSoftwareSuiteVersion> version() {
        return Optional.ofNullable(this.version);
    }

    private RobotApplicationRobotSoftwareSuite() {}

    private RobotApplicationRobotSoftwareSuite(RobotApplicationRobotSoftwareSuite $) {
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RobotApplicationRobotSoftwareSuite defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RobotApplicationRobotSoftwareSuite $;

        public Builder() {
            $ = new RobotApplicationRobotSoftwareSuite();
        }

        public Builder(RobotApplicationRobotSoftwareSuite defaults) {
            $ = new RobotApplicationRobotSoftwareSuite(Objects.requireNonNull(defaults));
        }

        public Builder name(RobotApplicationRobotSoftwareSuiteName name) {
            $.name = name;
            return this;
        }

        public Builder version(@Nullable RobotApplicationRobotSoftwareSuiteVersion version) {
            $.version = version;
            return this;
        }

        public RobotApplicationRobotSoftwareSuite build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
