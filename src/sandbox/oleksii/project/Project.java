package sandbox.oleksii.project;

import sandbox.oleksii.project.metadata.emails.EmailFolder;
import sandbox.oleksii.project.metadata.emails.EmailFolderXmlMeta;
import sandbox.oleksii.project.metadata.emails.EmailMetadata;
import sandbox.oleksii.project.metadata.emails.Emails;
import sandbox.oleksii.project.metadata.objectTranslations.ObjectTranslations;
import sandbox.oleksii.project.metadata.portals.Portals;
import sandbox.oleksii.project.metadata.appMenus.AppMenus;
import sandbox.oleksii.project.metadata.applications.Applications;
import sandbox.oleksii.project.metadata.approvalProcesses.ApprovalProcesses;
import sandbox.oleksii.project.metadata.assignmentRules.AssignmentRules;
import sandbox.oleksii.project.metadata.autoResponseRules.AutoResponseRules;
import sandbox.oleksii.project.metadata.certs.Certs;
import sandbox.oleksii.project.metadata.classes.Classes;
import sandbox.oleksii.project.metadata.cleanDataServices.CleanDataServices;
import sandbox.oleksii.project.metadata.communities.Communities;
import sandbox.oleksii.project.metadata.components.Components;
import sandbox.oleksii.project.metadata.connectedApps.ConnectedApps;
import sandbox.oleksii.project.metadata.dashboards.Dashboards;
import sandbox.oleksii.project.metadata.datacategorygroups.DataCategoryGroups;
import sandbox.oleksii.project.metadata.delegategroups.DelegateGroups;
import sandbox.oleksii.project.metadata.duplicateRules.DuplicateRules;
import sandbox.oleksii.project.metadata.groups.Groups;
import sandbox.oleksii.project.metadata.homePageComponents.HomePageComponents;
import sandbox.oleksii.project.metadata.labels.Labels;
import sandbox.oleksii.project.metadata.leadConvertSettings.LeadConvertSettings;
import sandbox.oleksii.project.metadata.matchingRules.MatchingRules;
import sandbox.oleksii.project.metadata.objects.Objects;
import sandbox.oleksii.project.metadata.pages.Pages;
import sandbox.oleksii.project.metadata.permissionSets.PermissionSets;
import sandbox.oleksii.project.metadata.profilePasswordPolicies.ProfilePasswordPolicies;
import sandbox.oleksii.project.metadata.profileSessionSettings.ProfileSessionSettings;
import sandbox.oleksii.project.metadata.quickActions.QuickActions;
import sandbox.oleksii.project.metadata.remoteSiteSettings.RemoteSiteSettings;
import sandbox.oleksii.project.metadata.reportTypes.ReportTypes;
import sandbox.oleksii.project.metadata.roles.Roles;
import sandbox.oleksii.project.metadata.scontrols.SControls;
import sandbox.oleksii.project.metadata.sharingRules.SharingRules;
import sandbox.oleksii.project.metadata.sites.Sites;
import sandbox.oleksii.project.metadata.standardValueSetTranslations.StandardValueSetTranslations;
import sandbox.oleksii.project.metadata.standardValueSets.StandardValueSets;
import sandbox.oleksii.project.metadata.staticResources.StaticResources;
import sandbox.oleksii.project.metadata.tabs.Tabs;
import sandbox.oleksii.project.metadata.translations.Translations;
import sandbox.oleksii.project.metadata.triggers.Triggers;
import sandbox.oleksii.project.metadata.weblinks.Weblinks;
import sandbox.oleksii.project.metadata.workflows.Workflows;

import java.io.File;

/**
 * Created by User on 04.01.2018.
 */
public class Project {

    private File root;

    public Pages pages;
    public Classes classes;
    public Triggers triggers;
    public Objects objects;
    public Components components;
    public Applications applications;
    public AppMenus appMenus;
    public AssignmentRules assignmentRules;
    public Certs certs;
    public Workflows workflows;
    public ApprovalProcesses approvalProcesses;
    public AutoResponseRules autoResponseRules;
    public Communities communities;
    public ConnectedApps connectedApps;
    public Weblinks webLinks;
    public Sites sites;
    public Tabs tabs;
    public Translations translations;
    public StaticResources staticResources;
    public StandardValueSets standardValueSets;
    public StandardValueSetTranslations standardValueSetTranslations;
    public Groups groups;
    public HomePageComponents homePageComponents;
    public Labels labels;
    public LeadConvertSettings leadConvertSettings;
    public MatchingRules matchingRules;
    public SharingRules sharingRules;
    public CleanDataServices cleanDataServices;
    public DataCategoryGroups dataCategoryGroups;
    public DelegateGroups delegateGroups;
    public Dashboards dashboards;
    public PermissionSets permissionSets;
    public DuplicateRules duplicateRules;
    public SControls sControls;
    public Roles roles;
    public ReportTypes reportTypes;
    public RemoteSiteSettings remoteSiteSettings;
    public QuickActions quickActions;
    public ProfileSessionSettings profileSessionSettings;
    public Portals portals;
    public ProfilePasswordPolicies profilePasswordPolicies;
    public ObjectTranslations objectTranslations;
    public Emails emails;

    public Project(String rootPath) {
        this.root = new File(rootPath);
        this.readFolders(rootPath);
    }

    private void readFolders(String rootPath) {
//        this.pages = new Pages(rootPath);
//        this.classes = new Classes(rootPath);
//        this.triggers = new Triggers(rootPath);
//        this.objects = new Objects(rootPath);
//        this.components = new Components(rootPath);
//        this.applications = new Applications(rootPath);
//        this.appMenu = new AppMenu(rootPath);
//        this.assignmentRules = new AssignmentRules(rootPath);
//        this.certs = new Certs(rootPath);
//        this.workflows = new Workflows(rootPath);
//        this.approvalProcesses = new ApprovalProcesses(rootPath);
//        this.autoResponseRules = new AutoResponseRules(rootPath);
//        this.communities = new Communities(rootPath);
//        this.connectedApps = new ConnectedApps(rootPath);
//        this.webLinks = new Weblinks(rootPath);
//        this.sites = new Sites(rootPath);
//        this.tabs = new Tabs(rootPath);
//        this.translations = new Translations(rootPath);
//        this.staticResources = new StaticResources(rootPath);
//        this.standardValueSets = new StandardValueSets(rootPath);
//        this.standardValueSetTranslations = new StandardValueSetTranslations(rootPath);
//        this.groups = new Groups(rootPath);
//        this.homePageComponents = new HomePageComponents(rootPath);
//        this.labels = new Labels(rootPath);
//        this.leadConvertSettings = new LeadConvertSettings(rootPath);
//        this.matchingRules = new MatchingRules(rootPath);
//        this.sharingRules = new SharingRules(rootPath);
//        this.cleanDataServices = new CleanDataServices(rootPath);
//        this.dataCategoryGroups = new DataCategoryGroups(rootPath);
//        this.delegateGroups = new DelegateGroups(rootPath);
//        this.dashboards = new Dashboards(rootPath);
//        this.permissionSets = new PermissionSets(rootPath);
//        this.duplicateRules = new DuplicateRules(rootPath);
//        this.sControls = new SControls(rootPath);
//        this.roles = new Roles(rootPath);
//        this.reportTypes = new ReportTypes(rootPath);
//        this.remoteSiteSettings = new RemoteSiteSettings(rootPath);
//        this.quickActions = new QuickActions(rootPath);
//        this.profileSessionSettings = new ProfileSessionSettings(rootPath);
//        this.portals = new Portals(rootPath);
//        this.profilePasswordPolicies = new ProfilePasswordPolicies(rootPath);
//        this.objectTranslations = new ObjectTranslations(rootPath);
        this.emails = new Emails(rootPath);
    }


    public static void main(String[] args) throws Exception {
//        Project p2 = new Project("");
        Project p = new Project("");
        ((EmailFolder)p.emails.getFolders().get(0)).getMetadata().stream().forEach(item -> {
            try {
                System.out.println(((EmailMetadata) item).getRelatedMeta().getEntity().toXml());
                System.out.println();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }


//ToDo:
//documents
//escalationRules
//flexipages
//flowDefinitions
//flows
//globalValueSets
//homePageLayouts
//installedPackages
//layouts
//letterhead
//newreps
//profiles
//queues
//reports

//ToDo: define new supertype for entities with related meta
}
