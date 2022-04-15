// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.projects.inputs.AccessApprovalSettingsEnrolledServiceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessApprovalSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessApprovalSettingsArgs Empty = new AccessApprovalSettingsArgs();

    /**
     * A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can only be done on an all or nothing basis.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * 
     */
    @Import(name="enrolledServices", required=true)
      private final Output<List<AccessApprovalSettingsEnrolledServiceArgs>> enrolledServices;

    public Output<List<AccessApprovalSettingsEnrolledServiceArgs>> enrolledServices() {
        return this.enrolledServices;
    }

    /**
     * A list of email addresses to which notifications relating to approval requests should be sent.
     * Notifications relating to a resource will be sent to all emails in the settings of ancestor
     * resources of that resource. A maximum of 50 email addresses are allowed.
     * 
     */
    @Import(name="notificationEmails")
      private final @Nullable Output<List<String>> notificationEmails;

    public Output<List<String>> notificationEmails() {
        return this.notificationEmails == null ? Codegen.empty() : this.notificationEmails;
    }

    /**
     * - 
     * (Optional, Deprecated)
     * Deprecated in favor of `project_id`
     * 
     * @Deprecated
     * Deprecated in favor of `project_id`
     * 
     */
    @Deprecated /* Deprecated in favor of `project_id` */
    @Import(name="project")
      private final @Nullable Output<String> project;

    @Deprecated /* Deprecated in favor of `project_id` */
    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * ID of the project of the access approval settings.
     * 
     */
    @Import(name="projectId", required=true)
      private final Output<String> projectId;

    public Output<String> projectId() {
        return this.projectId;
    }

    public AccessApprovalSettingsArgs(
        Output<List<AccessApprovalSettingsEnrolledServiceArgs>> enrolledServices,
        @Nullable Output<List<String>> notificationEmails,
        @Nullable Output<String> project,
        Output<String> projectId) {
        this.enrolledServices = Objects.requireNonNull(enrolledServices, "expected parameter 'enrolledServices' to be non-null");
        this.notificationEmails = notificationEmails;
        this.project = project;
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
    }

    private AccessApprovalSettingsArgs() {
        this.enrolledServices = Codegen.empty();
        this.notificationEmails = Codegen.empty();
        this.project = Codegen.empty();
        this.projectId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessApprovalSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<AccessApprovalSettingsEnrolledServiceArgs>> enrolledServices;
        private @Nullable Output<List<String>> notificationEmails;
        private @Nullable Output<String> project;
        private Output<String> projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessApprovalSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enrolledServices = defaults.enrolledServices;
    	      this.notificationEmails = defaults.notificationEmails;
    	      this.project = defaults.project;
    	      this.projectId = defaults.projectId;
        }

        public Builder enrolledServices(Output<List<AccessApprovalSettingsEnrolledServiceArgs>> enrolledServices) {
            this.enrolledServices = Objects.requireNonNull(enrolledServices);
            return this;
        }
        public Builder enrolledServices(List<AccessApprovalSettingsEnrolledServiceArgs> enrolledServices) {
            this.enrolledServices = Output.of(Objects.requireNonNull(enrolledServices));
            return this;
        }
        public Builder enrolledServices(AccessApprovalSettingsEnrolledServiceArgs... enrolledServices) {
            return enrolledServices(List.of(enrolledServices));
        }
        public Builder notificationEmails(@Nullable Output<List<String>> notificationEmails) {
            this.notificationEmails = notificationEmails;
            return this;
        }
        public Builder notificationEmails(@Nullable List<String> notificationEmails) {
            this.notificationEmails = Codegen.ofNullable(notificationEmails);
            return this;
        }
        public Builder notificationEmails(String... notificationEmails) {
            return notificationEmails(List.of(notificationEmails));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder projectId(Output<String> projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        public Builder projectId(String projectId) {
            this.projectId = Output.of(Objects.requireNonNull(projectId));
            return this;
        }        public AccessApprovalSettingsArgs build() {
            return new AccessApprovalSettingsArgs(enrolledServices, notificationEmails, project, projectId);
        }
    }
}
