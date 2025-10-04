public class Notes {
    
    /*
    JUnit Notes:
    - JUnit is a popular testing framework for Java applications.
    - It allows developers to write and run repeatable tests.
    - Tests are typically organized into test classes, with each test method annotated with @Test.
    - Common assertions include assertEquals, assertTrue, assertFalse, assertNull, and assertNotNull.
    - JUnit supports setup and teardown methods using @BeforeEach, @AfterEach, @BeforeAll, and @AfterAll annotations.
    - Tests can be grouped into test suites for better organization.
    - JUnit 5 is the latest version, offering more features and flexibility compared to JUnit 4.    
    - Integration with build tools like Maven and Gradle is straightforward, allowing for automated testing during the build process.
    - IDEs like IntelliJ IDEA and Eclipse have built-in support for running JUnit tests.
    - Mocking frameworks like Mockito can be used alongside JUnit for more complex testing scenarios.
    - Code coverage tools like JaCoCo can be integrated to measure the effectiveness of tests.
    - Best practices include writing small, focused tests, using meaningful test names, and ensuring tests are independent of each other.
    - Regularly running tests helps catch bugs early and ensures code quality.
    - Continuous Integration (CI) systems often run JUnit tests automatically on code commits.

     */

    /*
    SDLC Notes:
    - SDLC stands for Software Development Life Cycle.
    - It is a process used by software industry to design, develop and test high quality software.
    - The SDLC aims to produce software that meets or exceeds customer expectations, reaches completion within times and cost estimates.
    - Common SDLC models include Waterfall, Agile, Iterative, Spiral, and V-Model.
    - Key phases of SDLC typically include:
      1. Planning: Defining the project scope, objectives, and feasibility.
      2. Requirements Analysis: Gathering and analyzing business requirements.
      3. Design: Creating architecture and design specifications.
      4. Implementation (or Coding): Writing the actual code based on design documents.
      5. Testing: Verifying that the software works as intended and identifying bugs.
      6. Deployment: Releasing the software to users or production environment.
      7. Maintenance: Ongoing support and updates to the software after deployment.
    - Each phase has specific deliverables and review processes to ensure quality and alignment with project goals.
    - Agile SDLC emphasizes iterative development, collaboration, and flexibility to change.
    - Effective communication among stakeholders is crucial throughout the SDLC.
    - Documentation is important at each stage to ensure clarity and continuity.
    - Risk management and quality assurance are integral parts of the SDLC.
    - Tools like JIRA, Trello, and Confluence are often used to manage SDLC processes.
    - Adopting best practices in SDLC can lead to successful project outcomes and satisfied customers.
     */

    /*
    Difference between JUnit and TestNG:
    - JUnit and TestNG are both popular testing frameworks for Java, but they have some differences:
      1. Annotations: JUnit uses annotations like @Test, @Before, @After, while TestNG uses @Test, @BeforeMethod, @AfterMethod, etc., providing more flexibility.
      2. Test Configuration: TestNG allows for more complex test configurations, including grouping tests and parameterized tests, which are more limited in JUnit.
      3. Parallel Execution: TestNG has built-in support for parallel test execution, making it easier to run tests concurrently. JUnit requires additional setup for parallelism.
      4. Dependency Testing: TestNG supports test dependencies, allowing tests to be dependent on the success of other tests. JUnit does not have this feature natively.
      5. Suite Testing: TestNG provides a more straightforward way to create test suites using XML configuration files, while JUnit requires more manual setup.
      6. Data-Driven Testing: TestNG has better support for data-driven testing through its @DataProvider annotation, whereas JUnit requires additional libraries for similar functionality.
      7. Community and Ecosystem: JUnit has been around longer and has a larger community and ecosystem, while TestNG is also widely used but may have fewer resources available.
      8. Integration: Both frameworks integrate well with build tools like Maven and Gradle, but JUnit is often the default choice in many projects.
    - The choice between JUnit and TestNG often depends on the specific needs of the project and the preferences of the development team.
    
     */

}
